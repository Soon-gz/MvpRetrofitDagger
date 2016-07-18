package com.abings.daager2demo.ui.A;

import com.abings.daager2demo.base.DataManager;
import com.abings.daager2demo.base.Precenter;
import com.abings.daager2demo.dagger.User;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public class APrecenter implements Precenter<AMvpView> {

    private AMvpView mvpView;
    private final DataManager dataManager;
    private Subscription subscription;

    @Inject
    public APrecenter(DataManager dataManager){
        this.dataManager = dataManager;
    }

    @Override
    public void attachView(AMvpView mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void detachView() {
        mvpView = null;
        if (subscription != null){
            subscription.unsubscribe();
        }
    }

    public void loadUser(User user){
        user.setSex("男");
        mvpView.updateView(user);
    }
}
