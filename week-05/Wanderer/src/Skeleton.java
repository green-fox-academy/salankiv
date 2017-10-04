public class Skeleton extends Characs {
	BoardMap boardMap;

	public Skeleton(BoardMap boardMap) {
		super("./assets/skeleton.png", 0, 0, "skeleton");
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
