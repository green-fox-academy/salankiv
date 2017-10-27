package com.greenfox.error.model.controller;

import com.greenfox.error.model.User;
import com.greenfox.error.model.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping(value = "/")
public class AppController {

    @Autowired
	UserService service;

    @Autowired
	User user;

    @GetMapping(value = "/app")
    public String index(Model model) {
        model.addAttribute("new_user", user);
		service.save(user);
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping(value = "/new")
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/app";
    }
}