package com.firstIntoSP.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component @Service, @Repository     // remove annotation when have Config file
public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello () {
        return "Hello from my first class. and myVar is " + myVar;
    }
}
