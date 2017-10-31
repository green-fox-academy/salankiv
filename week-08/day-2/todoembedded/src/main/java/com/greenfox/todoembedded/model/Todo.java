package com.greenfox.todoembedded.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	int id;
	String title;
	boolean isUrgent;
	boolean isDone;
}
