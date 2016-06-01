package com.ctmobile.okhttpxml.api;

import android.util.Log;

import com.ctmobile.okhttpxml.App;
import com.ctmobile.okhttpxml.AppPreferences;
import com.ctmobile.okhttpxml.SalesForceApi;
import com.ctmobile.okhttpxml.Session;
import com.ctmobile.okhttpxml.api.login.request.Body;
import com.ctmobile.okhttpxml.api.login.request.LoginRequest;
import com.ctmobile.okhttpxml.api.login.request.LoginRequestEnvelope;
import com.ctmobile.okhttpxml.api.login.response.LoginResponse;
import com.ctmobile.okhttpxml.api.login.response.LoginResponseEnvelope;
import com.ctmobile.okhttpxml.api.login.response.Result;
import com.ctmobile.okhttpxml.api.retrieve.request.RetrieveBody;
import com.ctmobile.okhttpxml.api.retrieve.request.RetrieveHeader;
import com.ctmobile.okhttpxml.api.retrieve.request.RetrieveRequest;
import com.ctmobile.okhttpxml.api.retrieve.request.RetrieveRequestEnvelope;
import com.ctmobile.okhttpxml.api.retrieve.request.SessionHeader;
import com.ctmobile.okhttpxml.api.retrieve.response.RetrieveResponseEnvelope;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by yurkiss on 6/1/16.
 */

public class NetworkCalls {

    public static final String TAG = NetworkCalls.class.getSimpleName();

    public interface SFCallback<T> {
        void onSuccess(T response);
        void onFailure(Throwable t);
    }

    public static void login(final SFCallback<LoginResponseEnvelope> sfCallback){

        SalesForceApi sf = App.getApp().getSalesForceApi();

        LoginRequestEnvelope en = new LoginRequestEnvelope();
        //en.setHeader(new Header());
        Body body = new Body();
        final LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("admin@df2.com.sand2");
        loginRequest.setPassword("poqw0912");
        body.setLoginRequest(loginRequest);
        en.setBody(body);

        // asynchronous
        Call<LoginResponseEnvelope> call = sf.login(en);
        call.enqueue(new Callback<LoginResponseEnvelope>() {
            @Override
            public void onResponse(Call<LoginResponseEnvelope> call, Response<LoginResponseEnvelope> response) {
                // response.isSuccessful() is true if the response code is 2xx
                if (response.isSuccessful()) {
                    LoginResponseEnvelope envelope = response.body();
                    handleLoginResponse(envelope);
                    sfCallback.onSuccess(envelope);

                } else {
                    int statusCode = response.code();

                    // handle request errors yourself
                    ResponseBody errorBody = response.errorBody();
                    Log.d(TAG, "onResponse: " + errorBody.toString());

                }
                Log.d(TAG, "onResponse: successful!");
            }

            @Override
            public void onFailure(Call<LoginResponseEnvelope> call, Throwable t) {
                // handle execution failures like no internet connectivity
                sfCallback.onFailure(t);
                Log.d(TAG, "onFailure: " + t.getMessage());
                t.printStackTrace();
            }
        });

    }

    private static void handleLoginResponse(LoginResponseEnvelope envelope) {

        com.ctmobile.okhttpxml.api.login.response.Body loginBody = envelope.getBody();
        if (loginBody != null) {
            LoginResponse loginResponse = loginBody.getLoginResponse();
            if (loginResponse != null) {
                Result result = loginResponse.getResult();
                if (result != null) {

                    String newUrl = result.getServerUrl();
                    App.getApp().setApiURL(newUrl);

                    Session.getInstance().setSessionId(result.getSessionId());

                    AppPreferences preferences = new AppPreferences(App.getApp().getApplicationContext());
                    preferences.saveUserId(result.getUserId());
//                    preferences.saveProfileId(profileId);
//                    preferences.saveOrganizationId(organizationId);
                    preferences.saveUrl(result.getServerUrl());
                    preferences.saveSessionId(Session.getInstance().getSessionId());

                    String s = result.toString();
                    Log.d(TAG, "onResponse: " + s);


                }
            }
        }
    }

    public static void retrieve(final SFCallback<RetrieveResponseEnvelope> sfCallback){

        SalesForceApi sf = App.getApp().getSalesForceApi();

        RetrieveRequestEnvelope en = new RetrieveRequestEnvelope();

        RetrieveHeader header = new RetrieveHeader();
        SessionHeader sessionHeader = new SessionHeader();
        sessionHeader.setSessionId(Session.getInstance().getSessionId());
        header.setSessionHeader(sessionHeader);
        en.setHeader(header);

        RetrieveBody body = new RetrieveBody();
        RetrieveRequest request = new RetrieveRequest();
        request.setFieldList("Body");
        request.setsObjectType("Document");
        ArrayList<String> ids = new ArrayList<>();
        ids.add("015g0000000DvDhAAK");
        request.setIds(ids);
        body.setRetrieveRequest(request);

        en.setBody(body);

        // asynchronous
        Call<RetrieveResponseEnvelope> call = sf.retrieve(en);
        call.enqueue(new Callback<RetrieveResponseEnvelope>() {
            @Override
            public void onResponse(Call<RetrieveResponseEnvelope> call, Response<RetrieveResponseEnvelope> response) {
                // response.isSuccessful() is true if the response code is 2xx
                if (response.isSuccessful()) {
                    RetrieveResponseEnvelope envelope = response.body();
                    //handleLoginResponse(envelope);
                    sfCallback.onSuccess(envelope);

                } else {
                    int statusCode = response.code();

                    // handle request errors yourself
                    ResponseBody errorBody = response.errorBody();
                    Log.d(TAG, "onResponse: " + errorBody.toString());

                }
                Log.d(TAG, "onResponse: successful!");
            }

            @Override
            public void onFailure(Call<RetrieveResponseEnvelope> call, Throwable t) {
                // handle execution failures like no internet connectivity
                sfCallback.onFailure(t);
                Log.d(TAG, "onFailure: " + t.getMessage());
                t.printStackTrace();
            }
        });

    }


}
