package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by xns on 2017/3/23.
 */

public class SmallApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this);
        Small.setLoadFromAssets(BuildConfig.LOAD_FROM_ASSETS);
    }
}
