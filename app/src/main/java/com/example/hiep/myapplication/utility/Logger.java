package com.example.hiep.myapplication.utility;

import android.util.Log;

/**
 * Created by hiepnd6741 on 11/07/2017
 */

public class Logger {
    private static boolean IS_SHOW_LOG = true;
    private static final String TAG = Logger.class.getSimpleName();

    public static void d(String tag, String message) {
        if (IS_SHOW_LOG) Log.d(tag, message);
    }

    public static void d(String message) {
        if (IS_SHOW_LOG) Log.d(TAG, message);
    }


    public static void e(String tag, String message) {
        if (IS_SHOW_LOG) Log.e(tag, message);
    }

    public static void e(String message) {
        if (IS_SHOW_LOG) Log.e(TAG, message);
    }


    public static void i(String tag, String message) {
        if (IS_SHOW_LOG) Log.i(tag, message);
    }

    public static void i(String message) {
        if (IS_SHOW_LOG) Log.i(TAG, message);
    }
}
