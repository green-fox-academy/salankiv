package main.java.music;

public class Violin extends StringedInstrument {

	public Violin() {
		this.name = "Violin";
		this.numberOfStrings = 4;
	}

	public Violin(int strings) {
		this.name = "Violin";
		this.numberOfStrings = strings;
	}
	@Override
	public String sound() {
		return "Screech";
	}
}
