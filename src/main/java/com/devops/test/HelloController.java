package com.devops.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello from Dev!";
    }
    
     @GetMapping("/api")
    public String api() {
        return "Hello from API!";
    }
}
