package com.greenfox.salankiv.restcontroller.controller;

import com.greenfox.salankiv.restcontroller.loghandler.Entry;
import com.greenfox.salankiv.restcontroller.loghandler.History;
import com.greenfox.salankiv.restcontroller.loghandler.Log;
import com.greenfox.salankiv.restcontroller.loghandler.LogRepository;
import com.greenfox.salankiv.restcontroller.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	LogRepository logRepository;

	@GetMapping(value = "/doubling")
	public Twice doubleParam(@RequestParam(value = "input", required = true) int received, HttpServletRequest request) {
		Twice newTwice = new Twice(received);
		String url = request.getServletPath();
		String data = request.getQueryString();
		logRepository.save(new Log(url, data));
		return newTwice;
	}

	@GetMapping(value = "/greeter")
	public Greeting greet(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title, HttpServletRequest request) {
		String url = request.getServletPath();
		String data = request.getQueryString();
		logRepository.save(new Log(url, data));
		return new Greeting(name, title);
	}

	@GetMapping(value = "/appenda/{appendable}")
	public AppendA appendA(@PathVariable(value = "appendable") String whatToAppend, HttpServletRequest request) {
		String url = request.getServletPath();
		String data = request.getQueryString();
		logRepository.save(new Log(url, data));
		return new AppendA(whatToAppend);
	}

	@PostMapping(value = "/dountil/{action}")
	public ResultNumber sumDoUntil(@PathVariable(value = "action") String action, @RequestBody DoUntil doUntil, HttpServletRequest request) {
		String url = request.getServletPath();
		String data = request.getQueryString();
		logRepository.save(new Log(url, data));
		ResultNumber resultNumber = doUntil.getResult(action);
		return resultNumber;
	}

	@PostMapping(value = "/arrays")
	public ResultNumber handleTheArray(@RequestBody ArrayHandler arrayHandler, HttpServletRequest request) {
		String url = request.getServletPath();
		String data = request.getQueryString();
		logRepository.save(new Log(url, data));
		ResultNumber resultNumber = arrayHandler.getResult();
		return resultNumber;
	}

	@GetMapping(value = "/log")
	public History getLogHistory() {
		List<Object> entries = new ArrayList<>();
		for (Object e : logRepository.displayColumns()) {
			entries.add(e);
		}
		return new History(entries);
	}
}
