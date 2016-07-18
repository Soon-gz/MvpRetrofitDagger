package com.abings.daager2demo.dagger;

import java.io.Serializable;

/**
 * Created by HaomingXu on 2016/7/7.
 */
public class User implements Serializable{
    private String name;
    private String pass;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
