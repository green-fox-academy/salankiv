package main.java.music;

public abstract class StringedInstrument extends Instrument {
	int numberOfStrings;

	public StringedInstrument() {
	}

	public abstract String sound();

	@Override
	public void play() {
		super.play();
		System.out.println(", a " + this.numberOfStrings + "-stringed instrument, that " + this.sound());
	}
}
