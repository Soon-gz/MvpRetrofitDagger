package com.abings.daager2demo.dagger;

import com.abings.daager2demo.base.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by HaomingXu on 2016/7/7.
 */
@Singleton
@Component(modules = AppModule.class)
public interface ApplicationComponent {
    ActivityComponent plus(ActivityModule activityModule);
    DataManager dataManager();
}
