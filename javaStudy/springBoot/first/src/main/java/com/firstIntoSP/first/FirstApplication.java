package com.firstIntoSP.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class FirstApplication {

	public static void main(String[] args) {
        var contact = SpringApplication.run(FirstApplication.class, args);

        MyFirstService myFirstService = contact.getBean(MyFirstService.class);
        System.out.println(myFirstService.useMethodFromMyFirstClass());
        System.out.println(myFirstService.getCustomProperty());
        System.out.println(myFirstService.getCustomInteger());
	}

}
