package com.abings.daager2demo.ui.login;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.abings.daager2demo.R;
import com.abings.daager2demo.base.BaseActivity;
import com.abings.daager2demo.dagger.App;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginMvpView {


    @Inject
    LoginPecenter loginPecenter;


    @Bind(R.id.listview)
    ListView listView;

    @Override
    protected int setlayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void inject() {
        App.get(this).getActivityComponent().inject(this);
        loginPecenter.attachView(this);
    }

    @Override
    protected void initEvents(Bundle savedInstanceState) {
        ButterKnife.bind(this);
    }


    @Override
    public void showMessage(String mes) {
        Toast.makeText(LoginActivity.this, mes, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button)
    public void toA(){
//        startActivity(new Intent(this, AActivity.class));
        loginPecenter.loadData(0);
    }


    @Override
    public void showData(List list) {

    }
}
