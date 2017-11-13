package com.sawariedmt;

/**
 * Created by Faiz on 11/12/2017.
 */
import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Dell on 11/3/2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Arhkip_font.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}

