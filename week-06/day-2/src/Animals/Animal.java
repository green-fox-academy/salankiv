package Animals;

public abstract class Animal {

	String name;
	int age;
	String gender;
	int height;
	String color;

	public Animal(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello");
	}

	public abstract String wantChild();

	public String getName() {
		return name;
	}
}
