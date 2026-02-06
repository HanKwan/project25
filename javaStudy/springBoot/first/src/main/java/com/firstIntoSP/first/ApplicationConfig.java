package com.firstIntoSP.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("sayHelloBean")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("the value of myVar");
    }

}
