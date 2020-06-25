package com.example.school;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    private static final String TOKEN = "token";


    private SharedPreferences sharedPreferences;

    public Preferences(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static Preferences getInstance(Context context) {
        return new Preferences(context);
    }

    public void setToken(String token) {
        sharedPreferences.edit().putString(TOKEN, token).apply();
    }
    public void deleteToken() {
        sharedPreferences.edit().putString(TOKEN, "").apply();
    }

    public String getToken() {
        return sharedPreferences.getString(TOKEN, "");
    }


}
