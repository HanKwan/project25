package com.firstIntoSP.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First value of myVar");
    }
    @Bean
    @Primary
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second value of myVar");
    }

}
