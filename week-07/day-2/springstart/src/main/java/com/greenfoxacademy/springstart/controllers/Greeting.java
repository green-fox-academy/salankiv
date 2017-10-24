package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
	static AtomicLong idCounter = new AtomicLong();
	long id;
	String content;
	String name;

	public Greeting(String content, String name) {
		this.id = idCounter.incrementAndGet();
		this.content = content;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getName() {
		return name;
	}
}
