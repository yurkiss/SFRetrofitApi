package com.ctmobile.okhttpxml;

import android.app.Application;
import android.support.v4.util.ArrayMap;

import java.util.Map;

import static com.ctmobile.okhttpxml.ServiceGenerator.START_URL;

/**
 * Created by yurkiss on 6/1/16.
 */

public class App extends Application {

    private String apiURL;
    private static App instance;
//    private Map<String, SalesForceApi> sf;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

    }

    public String getApiURL() {
        return apiURL;
    }

    public void setApiURL(String apiURL) {
        this.apiURL = apiURL;
    }

    public static App getApp() {
        return instance;
    }

    public SalesForceApi getSalesForceApi(){
        if (apiURL == null){
            return ServiceGenerator.getSalesForceApi(START_URL);
        } else {
            return ServiceGenerator.getSalesForceApi(apiURL);
        }

    }

//    public SalesForceApi getSalesForceApi(String url) {
//        if (sf == null){
//            sf = new ArrayMap<>();
//            sf.put(apiURL, ServiceGenerator.getSalesForceApi(START_URL));
//        }
//
//        if ( sf.get(url) == null ){
//            sf.put(apiURL, ServiceGenerator.getSalesForceApi(url));
//            return sf.get(url);
//        }
//
//        return sf.get(url);
//    }
}
