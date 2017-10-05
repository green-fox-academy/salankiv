import java.awt.*;

public class Hud {

	public Hud() {
	}

	public void drawHud(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 720, 720, 130);
	}

	public void getHudInfo(Characs characs, Graphics graphics) {
		graphics.setColor(Color.BLACK);
		Font myFont = new Font("Arial", 3, 24);
		graphics.setFont(myFont);
		graphics.drawString(characs.hudInfo, 10, 740);
	}

}
