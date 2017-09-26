package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
	List<Plant> plants;

	public Garden() {
		plants = new ArrayList<>();
	}

	public void addTree(Tree newTree) {
		plants.add(newTree);
	}

	public void addFlower(Flower newFlower) {
		plants.add(newFlower);
	}

	public void watering() {
	//	when watering it should only water those what needs water with equally divided amount amongst them
	//	eg. watering with 40 and 4 of them need water then each gets watered with 10
	}

	public void status() {
		for (int i = 0; i < plants.size(); i++) {
			System.out.println(plants.get(i).name);
		}

	}

	public static void main(String[] args) {

		Garden exampleGarden = new Garden();
		Flower flower1 = new Flower("orange");
		Tree tree1 = new Tree("black");
		Tree tree2 = new Tree("white");

		exampleGarden.addFlower(flower1);
		exampleGarden.addTree(tree1);
		exampleGarden.addTree(tree2);

		exampleGarden.status();

	}
}
