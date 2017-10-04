import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends PositionedImage{

	public Hero() {
		super("./assets/hero-down.png", 0, 0);
	}

	public void movingUp() {
		this.posY -= 1;
		try {
			this.image = ImageIO.read(new File("./assets/hero-up.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void movingDown() {
		this.posY += 1;
		try {
			this.image = ImageIO.read(new File("./assets/hero-down.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void movingRight() {
		this.posX += 1;
		try {
			this.image = ImageIO.read(new File("./assets/hero-right.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void movingLeft() {
		this.posX -= 1;
		try {
			this.image = ImageIO.read(new File("./assets/hero-left.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void turnDown() {
		try {
			this.image = ImageIO.read(new File("./assets/hero-down.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void turnUp() {
		try {
			this.image = ImageIO.read(new File("./assets/hero-up.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void turnRight() {
		try {
			this.image = ImageIO.read(new File("./assets/hero-right.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void turnLeft() {
		try {
			this.image = ImageIO.read(new File("./assets/hero-left.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}