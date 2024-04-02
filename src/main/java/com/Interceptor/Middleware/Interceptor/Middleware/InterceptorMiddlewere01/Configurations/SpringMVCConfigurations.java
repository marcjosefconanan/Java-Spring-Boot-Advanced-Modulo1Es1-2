package com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere01.Configurations;

import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere01.Interceptors.APILoggingInterceptor;
import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere01.Interceptors.LegacyIntercepotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfigurations implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyIntercepotr legacyIntercepotr;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyIntercepotr);
    }
}
