package com.org.ecommerce.config;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import java.io.IOException;

/*
    @EnableWebMvc 를 사용하면 "springboot"의 기본 설정이 꺼지고 수동으로 세팅해야 한다고 한다..
 */
@Configuration
//@EnableWebMvc
@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final Resource REACT_RESOURCE = new ClassPathResource("/build/index.html");


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/build/")
                .resourceChain(true)
                .addResolver(new PathResourceResolver() {
                    @Override
                    protected Resource getResource(@NonNull String resourcePath, @NonNull Resource location) throws IOException {
                        Resource requestedResource = location.createRelative(resourcePath);

                        boolean exists = requestedResource.exists();
                        boolean isReadable = requestedResource.isReadable();
                        boolean accessAble = exists && isReadable;

                        return accessAble ? requestedResource : REACT_RESOURCE;
                    }
                });
    }
}