package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
	List<Plant> plants;
	int counterFlowers;
	int counterTrees;

	public Garden() {
		plants = new ArrayList<>();
		counterFlowers = 0;
		counterTrees = 0;
	}

	public void addTree(Tree newTree) {
		plants.add(newTree);
		counterTrees += 1;
	}

	public void addFlower(Flower newFlower) {
		plants.add(newFlower);
		counterFlowers += 1;
	}

	public void watering(int amount) {
		System.out.println("Watering with " + amount);
		int counterThirsty = 0;
		for (int i = 0; i < plants.size(); i++) {
			if (plants.get(i).thirsty) counterThirsty++;
		}
		for (int i = 0; i < plants.size() ; i++) {
			if (plants.get(i).thirsty) plants.get(i).waterAmount += amount / counterThirsty * plants.get(i).absorption;
			plants.get(i).setThirsty();
		}
	}

	public void status() {
		System.out.println("In the garden there are " + counterFlowers + " flowers and " + counterTrees + " trees.");
		for (int i = 0; i < plants.size(); i++) {
			if (plants.get(i).thirsty) {
				System.out.println("The " + plants.get(i).color + " " + plants.get(i).name + " needs water.");
			} else {
				System.out.println("The " + plants.get(i).color + " " + plants.get(i).name + " doesn't need water.");
			}
		}
	}

	public static void main(String[] args) {

		Garden exampleGarden = new Garden();
		Flower flower1 = new Flower("yellow");
		Flower flower2 = new Flower("blue");
		Tree tree1 = new Tree("purple");
		Tree tree2 = new Tree("orange");

		exampleGarden.addFlower(flower1);
		exampleGarden.addFlower(flower2);
		exampleGarden.addTree(tree1);
		exampleGarden.addTree(tree2);

		exampleGarden.status();
		System.out.println();
		exampleGarden.watering(40);
		exampleGarden.status();
		System.out.println();
		exampleGarden.watering(100);
		exampleGarden.status();

	}
}
