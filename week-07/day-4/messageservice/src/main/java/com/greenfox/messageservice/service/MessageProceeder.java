package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

	@Autowired
	MessageService messageService;

	public void processMessage(String s, String s1) {
		messageService.sendMessage(s, s1);
	}
}
