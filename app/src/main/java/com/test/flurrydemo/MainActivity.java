package com.test.flurrydemo;

import android.os.Bundle;

import com.flurry.android.FlurryAgent;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String, String> map = new HashMap<String, String>();
        map.put("skip_mode", "timer");
        FlurryAgent.logEvent("welcome", map);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Map<String, String> map = new HashMap<String, String>();
        map.put("skip_mode", "timer");
        FlurryAgent.logEvent("byebye", map);
    }
}
