package com.htu.htudi.controllers;

import com.htu.htudi.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String getGreeting() {
		return greetingService.sayHello();
	}

}
