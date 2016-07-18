package com.abings.daager2demo.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abings.daager2demo.dagger.App;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setlayoutId());
        App.get(this).createActivityComponent(this);
        inject();
        initEvents(savedInstanceState);
    }

    protected abstract int setlayoutId();
    protected abstract void inject();
    protected abstract void initEvents(Bundle savedInstanceState);

}
