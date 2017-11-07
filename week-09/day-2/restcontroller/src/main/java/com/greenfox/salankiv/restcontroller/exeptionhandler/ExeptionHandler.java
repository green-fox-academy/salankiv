package com.greenfox.salankiv.restcontroller.exeptionhandler;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExeptionHandler {

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

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ErrorText displayHttpError(HttpMessageNotReadableException exeption) {
		ErrorText newError = new ErrorText();
		newError.setError(exeption.getMessage());
		return newError;
	}
}
