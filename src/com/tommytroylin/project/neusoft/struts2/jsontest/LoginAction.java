package com.tommytroylin.project.neusoft.struts2.jsontest;

import com.opensymphony.xwork2.Action;

/**
 * Created by Tommy on 1/8/15.
 */
public class LoginAction implements Action {
    private String username;
    private String password;
    private String token = "tokenforTommy";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String execute() throws Exception {
       return Action.SUCCESS;
    }
}
