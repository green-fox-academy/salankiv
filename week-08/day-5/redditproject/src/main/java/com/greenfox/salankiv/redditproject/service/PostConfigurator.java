package com.greenfox.salankiv.redditproject.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfigurator {

	@Bean
	public PostManipulation postManipulation() {
		return new PostManipulation();
	}
}
