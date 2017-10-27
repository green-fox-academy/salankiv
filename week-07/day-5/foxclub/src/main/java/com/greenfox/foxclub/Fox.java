package com.greenfox.foxclub;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class Fox {
	String name;
	String food;
	String drink;
	List<Trick> tricks;
	int knownTricks;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public List<Trick> getTricks() {
		return tricks;
	}

	public void setTricks(List<Trick> tricks) {
		this.tricks = tricks;
	}

	public String getName() {
		return name;
	}

	public int getKnownTricks() {
		return knownTricks;
	}

	public Fox() {
		this.name = "Mr. Viktor";
		this.food = "salad";
		this.drink = "water";
		this.tricks = new ArrayList<>();
		this.knownTricks = this.tricks.size();

	}

}
