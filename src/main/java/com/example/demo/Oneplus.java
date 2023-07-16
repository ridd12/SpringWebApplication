package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Oneplus implements Phone{
    @Override
    public String name(){
        return "Oneplus phone";
    }
}
