package com.bgs.wikeyspringboot.filter;

import com.bgs.wikeyspringboot.dao.UserDao;
import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.DesUtil;
import com.bgs.wikeyspringboot.utils.DictionaryUtils;
import com.bgs.wikeyspringboot.utils.SessionIsLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Filter;
@Component
public class AuthFilter1 implements HandlerInterceptor {
    @Autowired
    private SessionIsLogin sessionIsLogin;
    @Autowired
    private UserDao userDao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(sessionIsLogin.isLogin(request)){
            response.sendRedirect("/index");
            return true;
        }
        String ckUser= null;
        Cookie[] cookies = request.getCookies();

//        cookies 有值
        if(cookies.length<=0){
            for (Cookie c :cookies){
                if("auth".equals(c.getName())){
                    ckUser = c.getValue();
                }
            }
            String[] user_split = ckUser.split("_");
            String decryptName = DesUtil.decrypt(user_split[0]);
            String decryptPwd = DesUtil.decrypt(user_split[1]);
//            查询数据库有没有该用户
            List<User> users = userDao.loginUser(decryptName, decryptPwd);
            if(users.size() <=0){
                return false;
            }
            request.getSession().setAttribute(DictionaryUtils.session_user_auth,users.get(0));
            response.sendRedirect("/index");
//          cookies 没值
        }else {
            response.sendRedirect("/tologin");
            return false;
        }
        return true;
    }
}
