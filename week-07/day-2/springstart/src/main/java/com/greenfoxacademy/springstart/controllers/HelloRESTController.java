package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

	@RequestMapping (value = "/greeting")
	public String greeting() {
		Greeting greeting = new Greeting(1, "Hello greeting world!");
		return "id: " + greeting.getId() + " content: " + greeting.getContent();
	}
}
