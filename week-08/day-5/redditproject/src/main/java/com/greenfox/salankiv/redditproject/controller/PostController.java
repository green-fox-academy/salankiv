package com.greenfox.salankiv.redditproject.controller;

import com.greenfox.salankiv.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

	@Autowired
	PostRepository postRepository;

	@GetMapping(value = {"", "/", "/list"})
	public String listPosts() {
		return "postlist";
	}

	@GetMapping(value = {"/add"})
	public String addPost() {
		return "addpost";
	}

}
