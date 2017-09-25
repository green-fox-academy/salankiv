public class Animal {

	int hunger;
	int thirst;

	public Animal() {
		hunger = 50;
		thirst = 50;
	}

	public Animal(int hunger, int thirst) {
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public void eat() {
		hunger -= 1;
	}

	public void drink() {
		thirst -= 1;
	}

	public void play() {
		hunger += 1;
		thirst += 1;
	}

	public static void main(String[] args) {
		Animal newAnimal = new Animal();
		newAnimal.eat();
		System.out.println(newAnimal.hunger);

		newAnimal.play();
		System.out.println(newAnimal.thirst);

		Animal animalTwo = new Animal(30,90);
		System.out.println(animalTwo.thirst);

	}

}
