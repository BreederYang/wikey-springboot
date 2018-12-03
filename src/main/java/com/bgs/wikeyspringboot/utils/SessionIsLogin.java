package com.bgs.wikeyspringboot.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class SessionIsLogin {

    public boolean isLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        return session.getAttribute(DictionaryUtils.session_user_auth)!=null;
    }
}
