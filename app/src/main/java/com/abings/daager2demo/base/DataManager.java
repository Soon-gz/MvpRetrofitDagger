package com.abings.daager2demo.base;

import org.json.JSONObject;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * Created by HaomingXu on 2016/7/8.
 */
@Singleton
public class DataManager {
    private final APIService apiService;

    @Inject
    public DataManager(APIService apiService){
        this.apiService = apiService;
    }

    public Observable<JSONObject> getdatas(int page) {
        return apiService.getDatas(page);
    }
}
