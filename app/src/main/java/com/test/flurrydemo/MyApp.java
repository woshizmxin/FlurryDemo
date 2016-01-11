package com.test.flurrydemo;

import android.app.Application;

import com.flurry.android.FlurryAgent;

/**
 * Created by zhoumao on 16/1/11.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlurryAgent.setLogEnabled(false);
        FlurryAgent.init(this, "MR9PP4FYX67F5C9KRH8R");
    }
}
