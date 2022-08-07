package com.example.prefixapiuri.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Objects;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("/admin", clazz
                -> Objects.equals( clazz.getPackage().getName()
                , "com.example.prefixapiuri.admin"));
        configurer.addPathPrefix("/app", clazz
                -> Objects.equals( clazz.getPackage().getName()
                , "com.example.prefixapiuri.app"));
        configurer.addPathPrefix("/mini/app", clazz
                -> Objects.equals( clazz.getPackage().getName()
                , "com.example.prefixapiuri.mini.app"));
    }
}
