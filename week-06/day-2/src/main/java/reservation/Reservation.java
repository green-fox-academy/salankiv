package main.java.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservationy {
	static final List<String> DOW = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
	static final List<String> ALPHABET = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "Y"));

	public Reservation() {
		System.out.println("Booking# " + this.getCodeBooking() + " for " + this.getDowBooking());
	}

	@Override
	public String getDowBooking() {
		return DOW.get((int) (Math.random() * 8));
	}

	@Override
	public String getCodeBooking() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(ALPHABET.get((int) (Math.random() * ALPHABET.size())));
		}
		return sb.toString();
	}
}
