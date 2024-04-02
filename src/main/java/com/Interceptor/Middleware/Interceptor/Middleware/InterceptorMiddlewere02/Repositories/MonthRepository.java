package com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Repositories;

import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month,Long> {
    Month findByMonth(Integer monthNumber);
}
