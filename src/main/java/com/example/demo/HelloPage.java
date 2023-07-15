package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPage {

    @GetMapping("/")
    public String hey(){
        return "Hey Home page";
    }

    @GetMapping("/newPage")
    public String heyy(){
        return "Hey New there";
    }
}
