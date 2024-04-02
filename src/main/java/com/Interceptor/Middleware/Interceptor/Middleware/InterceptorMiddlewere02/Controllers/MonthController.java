package com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Controllers;

import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Entities.Month;
import com.Interceptor.Middleware.Interceptor.Middleware.InterceptorMiddlewere02.Services.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
public class MonthController {
    @Autowired
    private MonthService monthService;
    @GetMapping ("/monthNumber")
    public ResponseEntity<Month> findbyMonthNumber (@PathVariable Integer monthNUmber){
        Month monthFound = monthService.findMonthByNumber(monthNUmber);
        return ResponseEntity.ok().body(monthFound);
    }
}
