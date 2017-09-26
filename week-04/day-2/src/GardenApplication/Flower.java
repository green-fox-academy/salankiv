package GardenApplication;

public class Flower extends Plant{
	String name;

	public Flower(String color) {
		this.name = "Flower";
		this.absorption = 0.75;
		this.color = color;
	}
}
