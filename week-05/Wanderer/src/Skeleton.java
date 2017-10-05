public class Skeleton extends Characs {

	public Skeleton(int[] position) {
		super("./assets/skeleton.png", 0, 0, "skeleton");
		this.posX = position[0];
		this.posY = position[1];
		this.level = 1;
		this.maxHP = 10;
		this.currentHP = 10;
		this.defendP = 8;
		this.strikeP = 6;
		this.typeInfo = "Type: skeleton";
		this.hudInfo = typeInfo + " (Level: " + this.level + ".) HP: " + this.currentHP + "/" + this.maxHP;
	}

}
