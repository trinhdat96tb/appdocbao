package com.example.dattrinh.a24h;

import android.app.Application;
import android.content.Context;

/**
 * Created by DatTrinh on 6/20/2018.
 */

public class App extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        this.mContext = this;
        super.onCreate();
    }

    public static Context getContext() {
        return mContext;
    }
}
