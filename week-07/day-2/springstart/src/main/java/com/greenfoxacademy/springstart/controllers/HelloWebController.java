package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
	static AtomicLong webCounter = new AtomicLong();

	@RequestMapping(value = "/web/greeting")
	public String greeting(@RequestParam String name, Model model) {
		Hello hello = new Hello();
		model.addAttribute("color", hello.color);
		model.addAttribute("hello", hello.value);
		model.addAttribute("name", name);
		model.addAttribute("counter", webCounter.incrementAndGet());
		return "greeting";
	}
}
