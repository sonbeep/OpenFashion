package com.example.openfashion;

import android.content.Context;
import android.content.SharedPreferences;

public class CommonUtils {
    private static final String PREF_FILE = "PREF_FILE";
    private static CommonUtils instance;
    private CommonUtils(){
        //for simgleton
    }

    public static CommonUtils getInstance() {
        if (instance == null){
            instance = new CommonUtils();
        }
        return instance;
    }

    public void savePref(String key, String value){
        SharedPreferences pref = App.getInstance().getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        pref.edit().putString(key, value).apply();
    }
    public String getPref(String key){
        SharedPreferences pref = App.getInstance().getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        return pref.getString(key, null);
    }
    public void cleanPref(String key){
        SharedPreferences pref = App.getInstance().getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        pref.edit().remove(key);
    }
}
