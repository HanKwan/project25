package com.firstIntoSP.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class FirstApplication {

	public static void main(String[] args) {
        var contact = SpringApplication.run(FirstApplication.class, args);

        MyFirstClass myFirstClass = contact.getBean("sayHelloBean",MyFirstClass.class);
        System.out.println(myFirstClass.sayHello());
	}

}
