package main.java.music;

public class ElectricGuitar extends StringedInstrument {

	public ElectricGuitar() {
		this.name = "Electric Guitar";
		this.numberOfStrings = 6;
	}

	public ElectricGuitar(int strings) {
		this.name = "Electric Guitar";
		this.numberOfStrings = strings;
	}

	@Override
	public String sound() {
		return "Twang";
	}
}
