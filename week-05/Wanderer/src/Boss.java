public class Boss extends Characs{

	public Boss(int[] position) {
		super("../assets/boss.png", 0, 5, "boss");
		this.posX = position[0];
		this.posY = position[1];
		this.level = 1;
		this.maxHP = 10;
		this.currentHP = 10;
		this.defendP = 8;
		this.strikeP = 6;
	}

}
