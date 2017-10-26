package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

	@Bean
	public MessageProceeder messageProceeder() {
		return new MessageProceeder();
	}

	@Bean
	public MessageService messageService() {
		return new EmailService();
	}
}
