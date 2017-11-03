package com.greenfox.salankiv.redditproject.service;

import com.greenfox.salankiv.redditproject.model.Post;

public class PostManipulation {

	public void increaseScore(Post post) {
		post.setScore(post.getScore() + 1);
	}

	public void decreaseScore(Post post) {
		post.setScore(post.getScore() - 1);
	}
}
