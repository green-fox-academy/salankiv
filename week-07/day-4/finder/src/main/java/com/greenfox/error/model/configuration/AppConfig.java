package com.greenfox.error.model.configuration;

import com.greenfox.error.model.User;
import com.greenfox.error.model.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public UserService service() {
		return new UserService();
	}

	@Bean
	public User user(){
		return new User();
	}
}
