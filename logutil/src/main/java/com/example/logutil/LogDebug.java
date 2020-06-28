package com.example.logutil;

import android.util.Log;

public class LogDebug {

    public static final String TAG = "TYLERS_REVOLUTIONARY_APP";

    public static void d(String msg){

        Log.d(TAG, msg);
    }

}
