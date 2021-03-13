package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParceApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("paOly7hMDXiDxpm6EjI9P9dgnbWyfwNurnHZo6zK")
                .clientKey("wfE6JPRrJyFEwkKVwT7vSeBUY5OKUXeyxNFTIW7u")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
