package com.greenfox.error.model;

import java.util.ArrayList;

/**
 * Created by aze on 25/10/17.
 */
public class UserService {

	private ArrayList<User> users;

	public UserService() {
		this.users = new ArrayList<>();
	}

	public ArrayList<User> getAll() {
		return users;
	}

	public void save(User user) {
		users.add(user);
	}
}
