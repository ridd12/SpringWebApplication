package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GivePhoneController {
    private Phone firstPhone;
    @Autowired
    public GivePhoneController(@Qualifier("iphone") Phone one){
    firstPhone=one;
    }

    @GetMapping("/getPhone")
    public String getPhone(){
        return firstPhone.name();
    }
}
