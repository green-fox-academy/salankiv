package com.greenfoxacademy.banksimba.controller;

import com.greenfoxacademy.banksimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BankSimbaController {

	@RequestMapping(value = "/exercise1")
	public String createAccount(Model model) {
		BankAccount account = new BankAccount("Simba", 2000, "lion");
		model.addAttribute("account", account);
		return "exercise1";
	}
}
