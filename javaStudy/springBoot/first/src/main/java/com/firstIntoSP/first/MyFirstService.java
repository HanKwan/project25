package com.firstIntoSP.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    final MyFirstClass myFirstClass;

    @Value("${my.custom.prop}")
    private String customProperty;

    @Value("${my.custom.prop.int}")
    private Integer customInteger;

    // @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String useMethodFromMyFirstClass() {
        return "MyFirstService is saying: " + myFirstClass.sayHello();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomInteger() {
        return customInteger;
    }
}
