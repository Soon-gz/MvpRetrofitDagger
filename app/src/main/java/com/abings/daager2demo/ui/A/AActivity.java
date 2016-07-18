package com.abings.daager2demo.ui.A;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.abings.daager2demo.R;
import com.abings.daager2demo.base.BaseActivity;
import com.abings.daager2demo.dagger.App;
import com.abings.daager2demo.dagger.User;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AActivity extends BaseActivity implements AMvpView {

    @Inject
    APrecenter aPrecenter;

    @Bind(R.id.textview)
    TextView text;

    User user;

    @Override
    protected int setlayoutId() {
        return R.layout.activity_a;
    }

    @Override
    protected void inject() {
        App.get(this).getActivityComponent().inject(this);
        aPrecenter.attachView(this);
    }

    @Override
    protected void initEvents(Bundle savedInstanceState) {
        ButterKnife.bind(this);
        if (getIntent().hasExtra("user")){
            user = (User) getIntent().getSerializableExtra("user");
        }else{
            user = new User();
        }
        aPrecenter.loadUser(user);
    }

    @Override
    public void showMessage(String mes) {
        Toast.makeText(this, mes, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        aPrecenter.detachView();
    }

    @Override
    public void updateView(User user) {
        text.setText(user.getName()+user.getPass()+user.getSex());
    }
}
