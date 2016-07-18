package com.abings.daager2demo.base;

import org.json.JSONObject;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public interface APIService {
    @GET("list/{page}")
    Observable<JSONObject> getDatas(@Path("page")int page);
}
