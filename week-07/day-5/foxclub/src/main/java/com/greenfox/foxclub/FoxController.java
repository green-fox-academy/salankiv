package com.greenfox.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoxController {

	@RequestMapping(value = "/")
	public String loadMain() {
		return "index";
	}
}
