package com.greenfox.salankiv.restcontroller.controller;

import com.greenfox.salankiv.restcontroller.model.Twice;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping(value = "/doubling")
	public Twice doubleParam(@RequestParam(value = "input", required = true) int received) {
		Twice newTwice = new Twice(received);
		return newTwice;
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ErrorText doubleParamError() {
		ErrorText newError = new ErrorText();
		newError.setError("Please provide an input!");
		return newError;
	}

}
