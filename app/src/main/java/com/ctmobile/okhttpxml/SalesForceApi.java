package com.ctmobile.okhttpxml;

import com.ctmobile.okhttpxml.api.login.request.LoginRequestEnvelope;
import com.ctmobile.okhttpxml.api.login.response.LoginResponseEnvelope;
import com.ctmobile.okhttpxml.api.retrieve.request.RetrieveRequestEnvelope;
import com.ctmobile.okhttpxml.api.retrieve.response.RetrieveResponseEnvelope;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by yurkiss on 6/1/16.
 */

public interface SalesForceApi {

    //public static final String PROPERTY_SERVICES = "/services/Soap/u/36.0/00Dg0000003L8Y6";
    public static final String PROPERTY_SERVICES = "services/Soap/u/37.0";

    //@Headers({"Content-Type: text/xml", "Accept-Charset: utf-8"})
    @POST("/")
    Call<LoginResponseEnvelope> login(@Body LoginRequestEnvelope body);

    @POST("/")
    Call<RetrieveResponseEnvelope> retrieve(@Body RetrieveRequestEnvelope body);

}
