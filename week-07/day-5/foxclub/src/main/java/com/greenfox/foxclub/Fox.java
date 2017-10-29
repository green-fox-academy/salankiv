package com.greenfox.foxclub;

import org.thymeleaf.spring4.expression.Fields;

import java.util.ArrayList;
import java.util.List;

public class Fox {

	String name;
	Drink drink;
	Food food;
	List<Trick> tricks;
	int knownTricks;

	public String getEating() {
		return food.name();
	}

	public void setEating(Food food) {
		this.food = food;
	}

	public String getDrinking() {
		return drink.name();
	}

	public void setDrinking(Drink drink) {
		this.drink = drink;
	}

	public String getName() {
		return name;
	}

	public List<Trick> getTricks() {
		return tricks;
	}

	public int getKnownTricks() {

		return knownTricks;
	}

	public Fox() {
		this.name = "Mr. Viktor";
		this.food = Food.SALAD;
		this.drink = Drink.WATER;
		this.tricks = new ArrayList<>();
		this.knownTricks = this.tricks.size();

	}
}
