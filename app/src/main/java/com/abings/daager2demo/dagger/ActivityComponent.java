package com.abings.daager2demo.dagger;

import com.abings.daager2demo.ui.A.AActivity;
import com.abings.daager2demo.ui.login.LoginActivity;

import dagger.Subcomponent;

/**
 * Created by HaomingXu on 2016/7/7.
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(LoginActivity loginActivity);
    void inject(AActivity aActivity);
}
