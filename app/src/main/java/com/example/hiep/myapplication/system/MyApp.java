package com.example.hiep.myapplication.system;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application{
    private static MyApp mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
    public static synchronized MyApp getInstance() {
        return mInstance;
    }

    public static synchronized Context getContext() {
        return mInstance.getApplicationContext();
    }

}
