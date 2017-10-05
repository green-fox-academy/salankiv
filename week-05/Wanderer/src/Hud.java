import java.awt.*;

public class Hud {

	public Hud() {
	}

	public void drawHud(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 720, 720, 130);
	}

	public void getHudInfo(Characs characs, Graphics graphics, String position) {
		int pos = 780;
		if (position.equals("up")) {
			pos = 740;
		}
		graphics.setColor(Color.BLACK);
		Font myFont = new Font("Arial", 3, 24);
		graphics.setFont(myFont);
		String hudInfo = "Type: " + "HP: " + characs.maxHP + "/" + characs.currentHP;
		graphics.drawString(hudInfo, 10, pos);
	}

}
