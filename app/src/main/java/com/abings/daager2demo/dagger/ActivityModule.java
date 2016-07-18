package com.abings.daager2demo.dagger;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by HaomingXu on 2016/7/7.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity){
        mActivity = activity;
    }

    @PerActivity
    @Provides
    public Activity providesActivity(){
        return mActivity;
    }
}
