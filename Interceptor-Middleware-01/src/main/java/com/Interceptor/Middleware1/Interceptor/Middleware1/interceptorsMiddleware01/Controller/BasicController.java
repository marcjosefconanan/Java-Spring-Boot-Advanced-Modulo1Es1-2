package com.Interceptor.Middleware1.Interceptor.Middleware1.interceptorsMiddleware01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping
    public String getCurrentDateTime() {
        return LocalDateTime.now().toString();
    }
}
