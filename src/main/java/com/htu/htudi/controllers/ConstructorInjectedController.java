package com.htu.htudi.controllers;

import com.htu.htudi.services.GreetingService;

public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayHello();
	}

}
