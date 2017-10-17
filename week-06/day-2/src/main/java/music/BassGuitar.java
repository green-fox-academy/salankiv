package main.java.music;

public class BassGuitar extends StringedInstrument {

	public BassGuitar() {
		this.name = "Bass Guitar";
		this.numberOfStrings = 4;
	}

	public BassGuitar(int strings) {
		this.name = "Bass Guitar";
		this.numberOfStrings = strings;
	}

	@Override
	public String sound() {
		return "Duum-duum-duum";
	}
}
