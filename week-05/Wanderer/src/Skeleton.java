public class Skeleton extends Characs {
	BoardMap boardMap;

	public Skeleton(BoardMap boardMap) {
		super("./assets/skeleton.png", 0, 0, "skeleton");
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
		this.typeInfo = "Type: skeleton";
		this.hudInfo = typeInfo + " (Level: " + this.level + ".) HP: " + this.currentHP + "/" + this.maxHP;
	}

	public int generateCoord() {
		return  (int) (Math.random() * 10);
	}

}
