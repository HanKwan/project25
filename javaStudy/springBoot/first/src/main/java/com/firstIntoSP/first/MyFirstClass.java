package com.firstIntoSP.first;

import org.springframework.stereotype.Component;

@Component  // @Service, @Repository
public class MyFirstClass {

    public String sayHello () {
        return "Hello from my first class.";
    }
}
