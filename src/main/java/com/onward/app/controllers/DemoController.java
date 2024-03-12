package com.onward.app.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

    @GetMapping("/")
    public String greet() {
        return "Onward!";
    }
    
    
}
