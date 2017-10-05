public class Characs extends PositionedImage {
	Object type;
	int level;
	int maxHP;
	int currentHP;
	int defendP;
	int strikeP;

	public Characs(String filename, int posX, int posY, Object type) {
		super(filename, posX, posY);
		this.level = 1;
		this.maxHP = 10;
		this.currentHP = 10;
		this.defendP = 8;
		this.strikeP = 6;
	}

	public void fight(Characs enemy) {
		enemy.currentHP -= 1;
	}

	public void live(Characs enemy) {

	}
}
