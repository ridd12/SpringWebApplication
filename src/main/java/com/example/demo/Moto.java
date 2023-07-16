package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

@Component
public class Moto implements Phone{
    @Override
    public String name(){
        return "Moto phone";
    }
}
