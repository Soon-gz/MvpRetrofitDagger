package com.abings.daager2demo.dagger;

import android.app.Application;

import com.abings.daager2demo.base.APIService;
import com.abings.daager2demo.base.RetrofitUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by HaomingXu on 2016/7/7.
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Singleton
    @Provides
    public Application providesApplication(){
        return application;
    }

    @Provides
    @Singleton
    APIService provideAPIService() {
        return RetrofitUtils.createApi(RxJavaCallAdapterFactory.create());
    }
}
