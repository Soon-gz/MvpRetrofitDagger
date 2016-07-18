package com.abings.daager2demo.base;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public interface Precenter<T extends IBaseView> {
    void attachView(T mvpView);
    void detachView();
}
