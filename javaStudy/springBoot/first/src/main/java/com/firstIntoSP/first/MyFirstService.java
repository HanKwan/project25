package com.firstIntoSP.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    final MyFirstClass myFirstClass;

    // @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String useMethodFromMyFirstClass() {
        return "MyFirstService is saying: " + myFirstClass.sayHello();
    }
}
