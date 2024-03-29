package com.greenfox.todoappwithmysql.model;

import javax.persistence.*;

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String title;
	boolean urgent;
	boolean done;

	public Todo(String title, boolean urgent, boolean done) {
		this.title = title;
		this.urgent = urgent;
		this.done = done;
	}

	public Todo() {
	}

	public Todo(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@OneToOne
	public Assignee assignee;

	public Assignee getAssignee() {
		return assignee;
	}

	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;
	}
}
