package com.test.flurrydemo;

import android.app.Activity;

import com.flurry.android.FlurryAgent;

/**
 * Created by zhoumao on 16/1/11.
 */
public class BaseActivity extends Activity {


    @Override
    protected void onStart() {
        super.onStart();
        FlurryAgent.setLogEnabled(false);
        FlurryAgent.onStartSession(this, "MR9PP4FYX67F5C9KRH8R"); //API_KEY为：ProjectApiKey.txt中API Key
    }

    @Override
    protected void onStop() {
        super.onStop();
        FlurryAgent.onEndSession(this);
    }
}
