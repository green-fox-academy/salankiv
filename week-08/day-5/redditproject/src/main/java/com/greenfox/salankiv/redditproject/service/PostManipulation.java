package com.greenfox.salankiv.redditproject.service;

import com.greenfox.salankiv.redditproject.model.Post;
import com.greenfox.salankiv.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

	public void listPosts(Model model, String pageNum) {
		Integer pageNumber;
		if (pageNum == null) {
			pageNumber = 0;
		} else if (pageNum.equals("-1")) {
			pageNumber = 0;
		}	else pageNumber = Integer.valueOf(pageNum);
		model.addAttribute("posts", postRepository.findAllByIdBetween((Long.valueOf(pageNumber*10 + 1)), Long.valueOf((pageNumber + 1) * 10)));
		model.addAttribute("pageNumber", pageNumber);
	}

	public void savePost(String content) {
		postRepository.save(new Post(content));
	}
}
