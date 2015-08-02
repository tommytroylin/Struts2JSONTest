package com.tommytroylin.project.neusoft.struts2.jsontest.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tommy on 2/8/15.
 */
public class LoginValidator {
    private Map<String, Integer> userMap = new HashMap<>();
    private LoginValidator instance = new LoginValidator();

    private LoginValidator() {
        //这里只是简单实现。在项目中是从数据库中读取。并且需要缓存机制
        userMap.put("tokenForTommy", 0);
        userMap.put("tokenForDemo", 1);

    }

    public LoginValidator getInstance() {
        return instance;
    }

    public Integer getUserID(String token) {
        Integer result = userMap.get(token);
        return result;
    }

    public boolean validateUser(String token) {
        Integer result = userMap.get(token);
        return result != null;
    }


}
