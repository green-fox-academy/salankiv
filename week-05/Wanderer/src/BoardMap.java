public class BoardMap {

	int[] notWallCoords;
	int value;
	int x;
	int y;
	int[][] boardMap = {
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 0, 0, 0, 1, 1, 0, 0}
	};

	public int getValue(int x, int y) {
		this.value = boardMap[x][y];
		return value;
	}

	public int[] getNotWallCoords() {
		int x = generateCoord();
		int y = generateCoord();
		while (boardMap[x][y] != 0 && (x != 0 || y != 0)) {
			x = generateCoord();
			y = generateCoord();
		}
		notWallCoords = new int[2];
		notWallCoords[1] = x;
		notWallCoords[0] = y;
		return notWallCoords;
	}

	public int generateCoord() {
		return (int) (Math.random() * 10);
	}
}
