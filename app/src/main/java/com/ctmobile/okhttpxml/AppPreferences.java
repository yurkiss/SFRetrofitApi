package com.ctmobile.okhttpxml;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Artem Gorobets
 * Customertimes corp.
 * 27.05.2015
 */
public class AppPreferences {

    public static final String TAG = AppPreferences.class.getSimpleName();

    public static final String KEY_PREFS_LOGIN              = "login";
    public static final String KEY_PREFS_PASSWORD           = "password";
    public static final String KEY_PREFS_TOKEN              = "token";
    public static final String KEY_PREFS_USER_ID            = "user_id";
    public static final String KEY_PREFS_PROFILE_ID         = "profile_id";
    public static final String KEY_PREFS_ORGANIZATION_ID    = "organization_id";
    public static final String KEY_PREFS_SESSION_ID         = "session_id";
    public static final String KEY_PREFS_URL                = "url";

    public static final String KEY_PREFS_SYNC_STATUS        = "sync_status";

    public static final String KEY_PREFS_CB1_CHECKED        = "cb1";
    public static final String KEY_PREFS_CB2_CHECKED        = "cb2";
    public static final String KEY_PREFS_CB3_CHECKED        = "cb3";

    public static final String KEY_PREFS_PB1_VALUE          = "pb1";
    public static final String KEY_PREFS_PB2_VALUE          = "pb2";

    public static final String KEY_PREFS_PB1_MAX_VALUE      = "pb1max";
    public static final String KEY_PREFS_PB2_MAX_VALUE      = "pb2max";

    public static final String KEY_PREFS_SYNC_TIME          = "sync_time";


    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor preferencesEditor;

    public AppPreferences(Context context) {
        this.sharedPreferences = context.getSharedPreferences(TAG, Activity.MODE_PRIVATE);
        this.preferencesEditor = sharedPreferences.edit();
    }

    public void saveStringParameter(String key, String value) {
        preferencesEditor.putString(key, value);
        preferencesEditor.commit();
    }

    public String getStringParameter(String key) {
        return sharedPreferences.getString(key, "");
    }

    public void saveBooleanParameter(String key, boolean value) {
        preferencesEditor.putBoolean(key, value);
        preferencesEditor.commit();
    }

    public boolean getBooleanParameter(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public void saveIntParameter(String key, int value) {
        preferencesEditor.putInt(key, value);
        preferencesEditor.commit();
    }

    public int getIntParameter(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public String getLogin() {
        return sharedPreferences.getString(KEY_PREFS_LOGIN, "");
    }

    public void saveLogin(String login) {
        preferencesEditor.putString(KEY_PREFS_LOGIN, login);
        preferencesEditor.commit();
    }

    public String getPassword() {
        return sharedPreferences.getString(KEY_PREFS_PASSWORD, "");
    }

    public void savePassword(String password) {
        preferencesEditor.putString(KEY_PREFS_PASSWORD, password);
        preferencesEditor.commit();
    }

    public void saveUserId(String userId) {
        preferencesEditor.putString(KEY_PREFS_USER_ID, userId);
        preferencesEditor.commit();
    }

    public void saveProfileId(String profileId) {
        preferencesEditor.putString(KEY_PREFS_PROFILE_ID, profileId);
        preferencesEditor.commit();
    }

    public void saveOrganizationId(String organizationId) {
        preferencesEditor.putString(KEY_PREFS_ORGANIZATION_ID, organizationId);
        preferencesEditor.commit();
    }

    public void saveSessionId(String sessionId) {
        preferencesEditor.putString(KEY_PREFS_SESSION_ID, sessionId);
        preferencesEditor.commit();
    }

    public void saveUrl(String url) {
        preferencesEditor.putString(KEY_PREFS_URL, url);
        preferencesEditor.commit();
    }

    public String getOrganizationId() {
        return sharedPreferences.getString(KEY_PREFS_ORGANIZATION_ID, null);
    }
}
