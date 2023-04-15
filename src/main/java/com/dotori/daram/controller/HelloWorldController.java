package com.dotori.daram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api2/hello")
    public String test() {
        return "Hello World!";
    }
}