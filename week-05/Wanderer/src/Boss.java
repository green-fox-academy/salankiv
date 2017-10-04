public class Boss extends Characs{
	BoardMap boardMap;

	public Boss(BoardMap boardMap) {
		super("./assets/boss.png", 5, 5, "boss");
		this.boardMap = boardMap;
		this.posX = generateCoord();
		this.posY = generateCoord();
		while (boardMap.getValue(this.posX, this.posY) != 0) {
			this.posX = generateCoord();
			this.posY = generateCoord();
		}
	}

	public int generateCoord() {
		return  (int) (Math.random() * 10);
	}

}
