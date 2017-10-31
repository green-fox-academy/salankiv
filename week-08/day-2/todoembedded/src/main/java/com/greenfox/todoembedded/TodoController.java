package com.greenfox.todoembedded;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

	@RequestMapping(value = {"/", "/list"})
	@ResponseBody
	public String list(Model model) {
		return "This is my first todo";
	}
}
