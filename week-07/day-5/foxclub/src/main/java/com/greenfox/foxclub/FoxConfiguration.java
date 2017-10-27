package com.greenfox.foxclub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfiguration {

	@Bean
	public Fox fox() {
		return new Fox();
	}
}
