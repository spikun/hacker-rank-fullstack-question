package com.example.springapp.domain.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false) String name) {
        return StringUtils.hasText(name)
            ? String.format("Hello %s", name)
            : "Hello world";
    }
}
