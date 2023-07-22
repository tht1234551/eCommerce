package com.org.ecommerce.config;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import java.io.IOException;

/*
    @EnableWebMvc 를 사용하면 "springboot"의 기본 설정이 꺼지고 수동으로 세팅해야 한다고 한다..
 */
@Configuration
//@EnableWebMvc
//@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    @Value("${url.prefix}")
    private String API_URL;

    @Value("${url.version}")
    private String VERSION;

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public DispatcherServletRegistrationBean dispatcherServletRegistration() {
        DispatcherServletRegistrationBean registration = new DispatcherServletRegistrationBean(dispatcherServlet(), API_URL + VERSION);
        registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
        return registration;
    }
}