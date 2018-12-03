package com.bgs.wikeyspringboot;

import com.bgs.wikeyspringboot.filter.AuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthFilter authFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authFilter)
                .addPathPatterns("/**")
                .excludePathPatterns("/tologin","/index","/login","/register","/static/**")
                .excludePathPatterns("/demand/*");
    }
}
