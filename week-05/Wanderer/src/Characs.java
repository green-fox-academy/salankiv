public class Characs extends PositionedImage {
	String type;
	String hudInfo;
	int level;
	int maxHP;
	int currentHP;
	int defendP;
	int strikeP;

	public Characs(String filename, int posX, int posY, String type) {
		super(filename, posX, posY);
		this.level = 1;
		this.maxHP = 10;
		this.currentHP = 10;
		this.defendP = 8;
		this.strikeP = 6;
	}

}
