package com.abings.daager2demo.ui.A;

import com.abings.daager2demo.base.IBaseView;
import com.abings.daager2demo.dagger.User;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public interface AMvpView extends IBaseView {
    void updateView(User user);
}
