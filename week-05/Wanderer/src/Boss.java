public class Boss extends Characs{
	BoardMap boardMap;

	public Boss(BoardMap boardMap) {
		super("./assets/boss.png", 5, 5, "boss");
		this.boardMap = boardMap;
		this.posX = generateCoord();
		this.posY = generateCoord();
		while (boardMap.getValue(posY, posX) != 0) {
			this.posX = generateCoord();
			this.posY = generateCoord();
		}
		this.level = 1;
		this.maxHP = 10;
		this.currentHP = 10;
		this.defendP = 8;
		this.strikeP = 6;
		this.typeInfo = "Type: boss";
		this.hudInfo = typeInfo + " (Level: " + this.level + ".) HP: " + this.currentHP + "/" + this.maxHP;
	}

	public int generateCoord() {
		return  (int) (Math.random() * 10);
	}

}
