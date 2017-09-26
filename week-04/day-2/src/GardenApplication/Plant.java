package GardenApplication;

import java.util.List;

public class Plant {
	double waterAmount;
	double thirstyLevel;
	double absorption;
	boolean thirsty;
	String color;
	String name;

	public Plant() {
		this.waterAmount = 0;
		this.thirsty = true;
	}

	public void setThirsty() {
		thirsty = this.waterAmount < this.thirstyLevel;
	}
}
