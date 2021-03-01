package com.example.android_ig;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your Parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the back4app settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ot6xkoGvSPwWKDBZd5xIPTf6Wvq7ihGyMRt9hyAn") // should correspond to Application Id env variable
                .clientKey("LYJrnL1xjpMuwHYe6ghGo6Xjiy4YShLnYu9Gu4HQ")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
