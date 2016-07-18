package com.abings.daager2demo.ui.login;

import android.util.Log;

import com.abings.daager2demo.base.DataManager;
import com.abings.daager2demo.base.Precenter;
import com.abings.daager2demo.model.listBean;
import com.google.gson.Gson;

import org.json.JSONObject;

import javax.inject.Inject;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public class LoginPecenter implements Precenter<LoginMvpView> {

    private LoginMvpView mvpView;
    private final DataManager dataManager;
    private Subscription subscription;

    @Inject
    public LoginPecenter(DataManager dataManager){
        this.dataManager = dataManager;
    }

    @Override
    public void attachView(LoginMvpView mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void detachView() {
        mvpView = null;
        if (subscription != null){
            subscription.unsubscribe();
        }
    }

    public void loadData(int page){
        subscription = dataManager.getdatas(page).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<JSONObject>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(JSONObject result) {
                Log.i("TAG00",result.toString());
                Gson gson = new Gson();
                listBean listBean = gson.fromJson(result.toString(), listBean.class);
                //省略更新UI逻辑。。
            }
        });

    }

}
