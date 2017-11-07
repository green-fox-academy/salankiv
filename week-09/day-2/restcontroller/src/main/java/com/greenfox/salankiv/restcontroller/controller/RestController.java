package com.greenfox.salankiv.restcontroller.controller;

import com.greenfox.salankiv.restcontroller.model.*;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping(value = "/doubling")
	public Twice doubleParam(@RequestParam(value = "input", required = true) int received) {
		Twice newTwice = new Twice(received);
		return newTwice;
	}

	@GetMapping(value = "/greeter")
	public Greeting greet(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
		return new Greeting(name, title);
	}

	@GetMapping(value = "/appenda/{appendable}")
	public AppendA appendA(@PathVariable(value = "appendable") String whatToAppend) {
		return new AppendA(whatToAppend);
	}

	@PostMapping(value = "/dountil/{action}")
	public ResultNumber sumDoUntil(@PathVariable(value = "action") String action, @RequestBody DoUntil doUntil) {
		ResultNumber resultNumber = doUntil.getResult(action);
		return resultNumber;
	}

	@PostMapping(value = "/arrays")
	public ResultNumber handleTheArray(@RequestBody ArrayHandler arrayHandler) {
		ResultNumber resultNumber = arrayHandler.getResult();
		return resultNumber;
	}
}
