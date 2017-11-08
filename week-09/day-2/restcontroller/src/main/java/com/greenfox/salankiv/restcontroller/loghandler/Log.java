package com.greenfox.salankiv.restcontroller.loghandler;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	LocalDateTime createdAt;
	String endpoint;
	String data;

	public Log(String endpoint, String data) {
		this.createdAt = LocalDateTime.now();
		this.endpoint = endpoint;
		this.data = data;
	}

	public Log(Long id, String endpoint, String data) {
		this.id = id;
		this.endpoint = endpoint;
		this.data = data;
	}

	public Log() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
