package Aircraft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Carrier {
	int totalAmmo;
	int healthPoints;
	List<Aircraft> listOfAircraft = new ArrayList<>();
	int totalDamage;

	public Carrier(int ammo, int healthPoints) {
		this.totalAmmo = ammo;
		this.healthPoints = healthPoints;
	}

	public void addAircraft(String type) {
		if (type.equals("F16")) {
			F16 newF16 = new F16();
			listOfAircraft.add(newF16);
		}
		if (type.equals("F35")) {
			F35 newF35 = new F35();
			listOfAircraft.add(newF35);
		}
	}

	public void fill() {
		int ammoNeeded = 0;
		for (Aircraft a : listOfAircraft) {
			ammoNeeded += a.maxAmmo - a.currentAmmo;
		}
		if (ammoNeeded > totalAmmo) {
			for (int i = 0; i < listOfAircraft.size(); i++) {
				if (listOfAircraft.get(i).type.equals("F35")) {
					totalAmmo = listOfAircraft.get(i).refill(totalAmmo);
				}
			}
		}
		for (int i = 0; i < listOfAircraft.size(); i++) {
			totalAmmo = listOfAircraft.get(i).refill(totalAmmo);
		}
	}

	public int getTotalDamage() {
		for (Aircraft a : listOfAircraft) {
			totalDamage += a.fight();
		}
		return totalDamage;
	}

	public void getStatus(){
		System.out.println("HP: " + healthPoints + " Aircraft count: " + listOfAircraft.size() + " Ammo Storage: " + totalAmmo + " Total damage: " + this.getTotalDamage());
		for (Aircraft a : listOfAircraft) {
			System.out.println(a.getStatus());
		}
	}

	public static void main(String[] args) {
		Carrier first = new Carrier(100, 100);
		Carrier second = new Carrier(200, 200);

		for (int i = 0; i < 1; i++) {
			first.addAircraft("F35");
		}

		for (int i = 0; i < 1; i++) {
			second.addAircraft("F16");
		}
		second.addAircraft("F35");

		first.fill();
		second.fill();

		first.getStatus();
		second.getStatus();
	}

}
