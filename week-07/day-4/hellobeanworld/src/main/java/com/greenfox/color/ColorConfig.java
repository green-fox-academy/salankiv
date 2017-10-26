package com.greenfox.color;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

	@Bean
	public Color colorRed() {
		return new RedColor();
	}

	@Bean
	public Color colorBlue() {
		return new BlueColor();
	}

	@Bean
	public Color colorYellow() {
		return new YellowColor();
	}
}
