package GardenApplication;

public class Tree extends Plant{
	String name;

	public Tree(String color) {
		this.name = "Tree";
		this.absorption = 0.4;
		this.color = color;
	}
}
