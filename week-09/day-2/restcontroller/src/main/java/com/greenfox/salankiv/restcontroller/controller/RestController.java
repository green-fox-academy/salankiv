package com.greenfox.salankiv.restcontroller.controller;

import com.greenfox.salankiv.restcontroller.model.AppendA;
import com.greenfox.salankiv.restcontroller.model.ErrorText;
import com.greenfox.salankiv.restcontroller.model.Greeting;
import com.greenfox.salankiv.restcontroller.model.Twice;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping(value = "/doubling")
	public Twice doubleParam(@RequestParam(value = "input", required = true) int received) {
		Twice newTwice = new Twice(received);
		return newTwice;
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ErrorText displayError(MissingServletRequestParameterException errorMessage) {
		ErrorText newError = new ErrorText();
		if (errorMessage.getParameterName().equals("input")) {
			newError.setError("Please provide an input!");
		} else if (errorMessage.getParameterName().equals("name")) {
			newError.setError("Please provide a name!");
		} else if (errorMessage.getParameterName().equals("title")) {
			newError.setError("Please provide a title!");
		}
		return newError;
	}

	@GetMapping(value = "/greeter")
	public Greeting greet(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
		return new Greeting(name, title);
	}

	@GetMapping(value = "/appenda/{appendable}")
	public AppendA appendA(@PathVariable(value = "appendable") String whatToAppend) {
		return new AppendA(whatToAppend);
	}
}
