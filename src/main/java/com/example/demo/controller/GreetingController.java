package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller to handle greeting requests
@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
}