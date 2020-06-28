package com.example.errorutil;

import android.util.Log;

public class ErrorDebug {

    public static final String TAG = "TYLERS_REVOLUTIONARY_APP_DEBUG";

    public static void e(String msg){

        Log.e(TAG, msg);
    }

}
