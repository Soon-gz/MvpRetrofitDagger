package com.abings.daager2demo.dagger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.abings.daager2demo.base.DataManager;

import javax.inject.Inject;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public class App extends Application {
    private static ApplicationComponent applicationComponent;
    private ActivityComponent activityComponent;

    @Inject
    DataManager mDataManager;
    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().appModule(new AppModule(this)).build();
    }

    public void createActivityComponent(Activity activity){
        activityComponent = applicationComponent.plus(new ActivityModule(activity));
    }


    public ActivityComponent getActivityComponent(){
        return activityComponent;
    }

    public void releaseActivityComponent(){
        activityComponent = null;
    }


}
