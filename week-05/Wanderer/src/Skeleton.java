public class Skeleton extends Characs {

	public Skeleton() {
		super("./assets/skeleton.png", 0, 0, "skeleton");
		this.posX = generateCoord();
		this.posY = generateCoord();
	}

	public int generateCoord() {
		return  (int) (Math.random() * 10);
	}

}
