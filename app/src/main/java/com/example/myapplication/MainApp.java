package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.inputOutput.Response.ApiManager;

public class MainApp extends Application {

    public static ApiManager ApiManager;
    @Override
    public void onCreate() {
        super.onCreate();
        ApiManager = ApiManager.getInstance();
    }

}
