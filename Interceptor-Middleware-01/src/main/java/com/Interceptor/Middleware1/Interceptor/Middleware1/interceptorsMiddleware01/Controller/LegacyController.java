package com.Interceptor.Middleware1.Interceptor.Middleware1.interceptorsMiddleware01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @GetMapping
    public String getLegacyData() {
        return "This is just old code";
    }
}
