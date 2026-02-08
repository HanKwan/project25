package com.firstIntoSP.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@RestController
public class FirstApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstApplication.class, args);

        var myFirstService = context.getBean(MyFirstService.class);
        System.out.println(myFirstService.useMethodFromMyFirstClass());
        System.out.println(myFirstService.getCustomProperty());
        System.out.println(myFirstService.getCustomInteger());
	}

}
