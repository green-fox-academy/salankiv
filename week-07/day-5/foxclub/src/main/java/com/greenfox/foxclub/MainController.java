package com.greenfox.foxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Autowired
	Fox fox;

	@RequestMapping(value = "/")
	public String loadMain(Model model) {
		model.addAttribute("fox", fox);
		return "index";
	}

	@RequestMapping(value = "/nutritionStore")
	public String loadStore(Model model) {
		model.addAttribute("fox", fox);
		model.addAttribute("foods", Food.values());
		model.addAttribute("drinks", Drink.values());
		return "store";
	}

	@PostMapping(value = "/change")
	public String change(@ModelAttribute Fox fox, @ModelAttribute Food food, @ModelAttribute Drink drink) {
		this.fox.setEating(food);
		this.fox.setDrinking(drink);
		return "redirect:/nutritionStore";
	}
}
