package com.bgs.wikeyspringboot.filter;

import com.bgs.wikeyspringboot.dao.UserDao;
import com.bgs.wikeyspringboot.entity.User;
import com.bgs.wikeyspringboot.utils.DesUtil;
import com.bgs.wikeyspringboot.utils.DictionaryUtils;
import com.bgs.wikeyspringboot.utils.MD5Utils;
import com.bgs.wikeyspringboot.utils.SessionIsLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;

@Component
public class AuthFilter extends HandlerInterceptorAdapter {

    @Autowired
    private UserDao userDao;
    @Autowired
    private SessionIsLogin sessionIsLogin;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //判断用户是否登录
       if (sessionIsLogin.isLogin(request)){
           System.out.println("用户已登录");
           return true;
       }

        //用户没有登录
        Cookie[] cookie=request.getCookies();
       if (cookie == null){
           //如果cookie中没有用户信息
           response.sendRedirect("/tologin");
           return false;
       }
        String authCookie = null;
        for (Cookie ck:cookie){
            if ("auth".equals(ck.getName())){
                authCookie=ck.getValue();
            }
        }
        if (authCookie != null){
            String[] authArray = authCookie.split("_");
            String username = DesUtil.decrypt(authArray[0]);
            String password = DesUtil.decrypt(authArray[1]);
            String startTime=DesUtil.decrypt(authArray[2]);
            //cookie的时限为30天，超过30天重新重新登录
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            //将字符串时间转为date数据类型
            Date startDate=simpleDateFormat.parse(startTime);
            Date endTime= new Date();
            long t=endTime.getTime() - startDate.getTime();
            long day=t / (1000 * 60 * 60 * 24);
            if (day>30){
                response.sendRedirect("/tologin");
                return false;
            }

            //查询数据库
            System.out.println("username: "+username);
            System.out.println("password: "+password);
            List<User> userList = userDao.loginUser(username, password);
            System.out.println("size :"+userList.size());
            //用户名和密码匹配的情况下
            if (userList.size() > 0){
                request.getSession().setAttribute(DictionaryUtils.session_user_auth,userList.get(0));
            }else{
                System.out.println("not user");
                response.sendRedirect("/tologin");
                return false;
            }
        }else {
            //如果cookie中没有用户信息
            response.sendRedirect("/tologin");
            return false;
        }
        return true;
    }


}
