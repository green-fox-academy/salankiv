package com.greenfox.foxclub;

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
		return this.tricks.size();
	}

	public void learnTrick(Trick trick) {
		boolean isKnown = false;
		for (Trick t : this.tricks) {
			if (t.getName().equals(trick.getName())) {
				isKnown = true;
			}
		}
		if (!isKnown) {
			this.tricks.add(trick);
		}
	}

	public Fox() {
		this.name = "Mr. Viktor";
		this.food = Food.SALAD;
		this.drink = Drink.WATER;
		this.tricks = new ArrayList<Trick>();
	}
}
