package com.htu.htudi.controllers;

import com.htu.htudi.services.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayHello();
	}

}
