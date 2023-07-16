package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phone{
    @Override
    public String name(){
        return "Samsung phone";
    }
}
