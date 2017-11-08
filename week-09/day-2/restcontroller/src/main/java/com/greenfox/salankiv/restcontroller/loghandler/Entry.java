package com.greenfox.salankiv.restcontroller.loghandler;

import javax.persistence.Entity;

public class Entry {
	Long id;
	String data;
	String endpoint;

	public Entry(Long id, String data, String endpoint) {
		this.id = id;
		this.data = data;
		this.endpoint = endpoint;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
