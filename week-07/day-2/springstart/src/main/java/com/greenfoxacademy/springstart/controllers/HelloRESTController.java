package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

	@RequestMapping (value = "/greeting")
	public String greeting(@RequestParam String name) {
		Greeting greeting = new Greeting("Hello ", name);
		return "id: " + greeting.getId() + " content: " + greeting.getContent() + greeting.getName();
	}
}
