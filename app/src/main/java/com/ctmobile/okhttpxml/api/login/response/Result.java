
package com.ctmobile.okhttpxml.api.login.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Result<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "result")
@Namespace(reference = "urn:partner.soap.sforce.com")
public class Result {

    @Element(name = "metadataServerUrl", required = false)
    private String metadataServerUrl;
    @Element(name = "passwordExpired", required = false)
    private Boolean passwordExpired;
    @Element(name = "sandbox", required = false)
    private Boolean sandbox;
    @Element(name = "serverUrl", required = false)
    private String serverUrl;
    @Element(name = "sessionId", required = false)
    private String sessionId;
    @Element(name = "userId", required = false)
    private String userId;
    @Element(name = "userInfo", required = false)
    private UserInfo userInfo;

    public Result() {
    }

    public String getMetadataServerUrl() {
        return metadataServerUrl;
    }

    public void setMetadataServerUrl(String metadataServerUrl) {
        this.metadataServerUrl = metadataServerUrl;
    }

    public Boolean isPasswordExpired() {
        if (passwordExpired == null) {
            return false;
        } else {
            return passwordExpired;
        }
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public Boolean isSandbox() {
        if (sandbox == null) {
            return false;
        } else {
            return sandbox;
        }
    }

    public void setSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "Result{" +
                "metadataServerUrl='" + metadataServerUrl + '\'' + "\n" +
                ", passwordExpired=" + passwordExpired + "\n" +
                ", sandbox=" + sandbox + "\n" +
                ", serverUrl='" + serverUrl + '\'' + "\n" +
                ", sessionId='" + sessionId + '\'' + "\n" +
                ", userId='" + userId + '\'' + "\n" +
                ", userInfo=" + userInfo + "\n" +
                '}';
    }
}
