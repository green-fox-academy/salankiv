package com.greenfox.salankiv.redditproject.service;

import com.greenfox.salankiv.redditproject.model.Post;
import com.greenfox.salankiv.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class PostManipulation {

	@Autowired
	PostRepository postRepository;

	public void increaseScore(Long id) {
		Post post = postRepository.findOne(id);
		post.setScore(post.getScore() + 1);
		postRepository.save(post);
	}

	public void decreaseScore(Long id) {
		Post post = postRepository.findOne(id);
		post.setScore(post.getScore() - 1);
		postRepository.save(post);
	}

	public void listPosts(Model model, int page) {
		if (page < 0) {
			page = 0;
		}
		Pageable loadPage = new PageRequest(page, 10, Sort.Direction.DESC, "score");
		model.addAttribute("posts", postRepository.findAll(loadPage));
	}

	public void savePost(String content) {
		postRepository.save(new Post(content));
	}
}
