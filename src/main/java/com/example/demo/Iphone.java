package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Iphone implements Phone{
    @Override
    public String name(){
        return "Iphone";
    }
}
