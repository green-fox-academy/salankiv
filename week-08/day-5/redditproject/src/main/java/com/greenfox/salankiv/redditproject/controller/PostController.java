package com.greenfox.salankiv.redditproject.controller;

import com.greenfox.salankiv.redditproject.service.PostManipulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

	@Autowired
	PostManipulation postManipulation;

	@GetMapping(value = {"", "/", "/list"})
	public String listPosts(Model model, @RequestParam(value = "pageNumber", defaultValue = "1", required = false) String pageNum) {
		postManipulation.listPosts(model, pageNum);
		return "postlist";
	}

	@GetMapping(value = {"/add"})
	public String addPost() {
		return "addpost";
	}

	@GetMapping(value = {"/add/save"})
	public String savePost(@RequestParam String content) {
		postManipulation.savePost(content);
		return "addpost";
	}

	@GetMapping(value = {"/{id}/increase"})
	public String increaseScore(@PathVariable(value = "id") Long id) {
		postManipulation.increaseScore(id);
		return "redirect:/posts/";
	}

	@GetMapping(value = {"/{id}/decrease"})
	public String decreaseScore(@PathVariable(value = "id") Long id) {
		postManipulation.decreaseScore(id);
		return "redirect:/posts/";
	}

}
