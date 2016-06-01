package com.ctmobile.okhttpxml;

/**
 * Created by Artem Gorobets
 * Customertimes corp.
 * 20.04.2015
 */
public class Session {

    private static volatile Session mSession;

    private String login;
    private String password;
    private String sessionId;
    private String userId;
    private String serverUrl;


    public Session(Session mSession) {
        Session.mSession = mSession;
    }

    public static synchronized Session getInstance() {

        if (mSession == null) {
            mSession = new Session(mSession);
        }

        return mSession;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
}