package com.vishal.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayGreeting() {
        return "Hello Spring Boot! <br> To see a personalized greeting, add manually to the URL '/hello'.";
    }

    @GetMapping("/hello")
    public String greeting() {
        return "Nice to meet you! - (Greeting from Vishal)";
    }
}
