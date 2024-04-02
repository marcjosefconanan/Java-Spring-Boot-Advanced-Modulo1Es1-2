package com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Services;

import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Entities.Month;
import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Repositories.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonthService {
    @Autowired
    private MonthRepository monthRepository;
    public Month findMonthByNumber (Integer monthNumber){
        return monthRepository.findByMonth(monthNumber);
    }
}
