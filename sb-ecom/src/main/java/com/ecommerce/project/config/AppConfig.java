package com.ecommerce.project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}


/*
* ModelMapper is a Java library that simplifies object mapping by automating the copying of data between two objects, typically of different classes.
*  It is particularly useful when you have complex nested objects or when you need to map between DTOs (Data Transfer Objects) and domain models.
* */