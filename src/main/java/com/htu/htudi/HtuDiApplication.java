package com.htu.htudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.htu.htudi.controllers.MyController;

@SpringBootApplication
public class HtuDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(HtuDiApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
		
		String greetings = myController.sayHello();
		System.out.println(greetings);
	}

}
