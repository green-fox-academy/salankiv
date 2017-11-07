package com.greenfox.salankiv.restcontroller.controller;

import com.greenfox.salankiv.restcontroller.model.*;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.MissingResourceException;

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

	@PostMapping(value = "/dountil/{action}")
	public ResultNumber sumDoUntil(@PathVariable(value = "action") String action, @RequestBody DoUntil doUntil) {
		ResultNumber resultNumber = new ResultNumber();
		if (action.equals("sum")) {
			int temp = 0;
			for (int i = 1; i <= doUntil.getUntil(); i++) {
				temp += i;
			}
			resultNumber.setResult(temp);
		} else if (action.equals("factor")) {
			int temp = 1;
			for (int i = 1; i <= doUntil.getUntil(); i++) {
				temp *= i;
			}
			resultNumber.setResult(temp);
		}
		return resultNumber;
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ErrorText displayHttpError() {
		ErrorText newError = new ErrorText();
		newError.setError("Please provide a number!");
		return newError;
	}
}
