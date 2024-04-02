package com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Interceptors;

import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Entities.Month;
import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Repositories.MonthRepository;
import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Services.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MonthInterceptors implements HandlerInterceptor {
    @Autowired
    private MonthService monthService;
    private MonthRepository monthRepository;

    public MonthInterceptors() {
        monthRepository.save(new Month(1, "January", "Gennaio", "Januar"));
        monthRepository.save(new Month(2, "February", "Febbraio", "Februar"));
        monthRepository.save(new Month(3, "March", "Marzo", "März"));
        monthRepository.save(new Month(4, "April", "Aprile", "April"));
        monthRepository.save(new Month(5, "May", "Maggio", "Mai"));
        monthRepository.save(new Month(6, "June", "Giugno", "Juni"));
    }
}
