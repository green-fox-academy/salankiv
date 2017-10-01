package Aircraft;

public class Aircraft {
	int currentAmmo;
	int maxAmmo;
	int baseDamage;
	int allDamage;
	String type;
	String status;

	public Aircraft() {
		this.currentAmmo = 0;
	}

	public int fight() {
		this.allDamage = this.currentAmmo * this.baseDamage;
		this.currentAmmo = 0;
		return allDamage;
	}

	public int refill(int ammo) {
		if (ammo >= this.maxAmmo - this.currentAmmo) {
			int temp = this.maxAmmo - this.currentAmmo;
			this.currentAmmo = this.maxAmmo;
			return ammo - temp;
		} else {
			this.currentAmmo += ammo;
			return 0;
		}
	}

	public String getType() {
		return this.type;
	}

	public String getStatus() {
		return this.status = "Type: " + this.type + " Ammo: " + this.currentAmmo + " Base Damage: " + this.baseDamage + " All Damage: " + this.allDamage;
	}
}
