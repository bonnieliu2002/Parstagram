package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ycgVIrsr8kvRxxKkcUC0qYImlAuLZJNyixz0hyb3")
                .clientKey("Qitei2SycsYWxnQ3couolgF2mhe3BhUdth6N85kE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
