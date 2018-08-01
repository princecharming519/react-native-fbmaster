/**
 * AdSettingsManager.java
 * io.callstack.react.fbads;
 *
 * Created by Mike Grabowski on 29/09/16.
 * Copyright © 2016 Callstack.io. All rights reserved.
 */
package io.callstack.react.fbads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.facebook.ads.AdSettings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class AdSettingsManager extends ReactContextBaseJavaModule {

    public AdSettingsManager(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "CTKAdSettingsManager";
    }

    @ReactMethod
    public void addTestDevice(String deviceHashedId) {
        if (deviceHashedId.equals("current")) {
            SharedPreferences sp = getReactApplicationContext()
                .getSharedPreferences("FBAdPrefs", 0);

            deviceHashedId = sp.getString("deviceIdHash", null);
        }
        AdSettings.addTestDevice(deviceHashedId);
    }

    @ReactMethod
    public void clearTestDevices() {
        AdSettings.clearTestDevices();
    }

    @ReactMethod
    public void setLogLevel(String logLevel) {
        Log.w("AdSettingsManager", "This method is not supported on Android");
    }

    @ReactMethod
    public void setIsChildDirected(boolean isDirected) {
        AdSettings.setIsChildDirected(isDirected);
    }

    @ReactMethod
    public void setMediationService(String mediationService) {
        AdSettings.setMediationService(mediationService);
    }

    @ReactMethod
    public void setUrlPrefix(String urlPrefix) {
        AdSettings.setUrlPrefix(urlPrefix);
    }
}
