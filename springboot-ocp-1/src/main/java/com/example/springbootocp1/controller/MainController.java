package com.example.springbootocp1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController {

    @GetMapping("/getHelloWorld")
    public String getHelloWorld(){
        String greeting = "Hello World";
        return greeting;
    }
}