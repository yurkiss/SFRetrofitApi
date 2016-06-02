package com.ctmobile.okhttpxml;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.strategy.TreeStrategy;
import org.simpleframework.xml.stream.Format;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by yurkiss on 6/1/16.
 */

public class ServiceGenerator {

    public static final String START_URL = "https://test.salesforce.com/";
    //public static final String PROPERTY_URL = "https://cs17.salesforce.com";
    //private static final String NAMESPACE = "urn:partner.soap.sforce.com";
    private static final int CONNECTION_TIMEOUT = 60 * 1000;


    private static OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
                .addNetworkInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {

                        Request original = chain.request();

                        // Request customization: add request headers
                        Request.Builder requestBuilder = original.newBuilder()
                                .removeHeader("Content-Type")
                                .addHeader("Content-Type", "text/xml")
                                .addHeader("SOAPAction", "\"\"");

                        Request request = requestBuilder.build();
                        return chain.proceed(request);
                    }
                });

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        // add logging as last interceptor
        //httpClient.addNetworkInterceptor(logging);  // <-- this is the important line!
        //httpClient.addInterceptor(logging);  // <-- this is the important line!

        return httpClient.build();
    }

    private static Retrofit provideXMLRetrofit(String url){

        Strategy strategy = new AnnotationStrategy(new TreeStrategy());
        //Serializer serializer = new Persister(strategy);

        Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(
                    SimpleXmlConverterFactory.create(
                            new Persister(strategy, new Format("<?xml version=\"1.0\" encoding=\"utf-8\" ?>"))
                    )
            );

        Retrofit retrofit = builder.client(provideOkHttpClient()).build();

        return retrofit;

    }


    public static <S> S createService(Class<S> serviceClass, String url) {

        return provideXMLRetrofit(url).create(serviceClass);
    }


    public static SalesForceApi getSalesForceApi(String url) {
        return createService(SalesForceApi.class, url);
    }

}
