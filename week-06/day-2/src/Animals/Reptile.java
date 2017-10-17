package Animals;

public class Reptile extends Animal {

	public Reptile(String name) {
		super(name);
	}

	public String wantChild() {
		return "want a child from an egg!";
	}
}
