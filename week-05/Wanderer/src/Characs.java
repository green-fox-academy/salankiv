public class Characs extends PositionedImage {
	Object type;
	String typeInfo;
	String hudInfo;
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
		this.typeInfo = "Type: " + type;
		this.hudInfo = "Current HP" + this.currentHP;
	}

	public void fight(Characs enemy) {
		currentHP = currentHP - 1;
	}

	public void live(Characs enemy) {

	}
}
