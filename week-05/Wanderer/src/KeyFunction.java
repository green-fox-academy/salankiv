import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class KeyFunction {
	Hero theHero;
	BoardMap boardMap;
	ArrayList<Characs> characsList;

	public KeyFunction(Hero theHero, BoardMap boardMap, ArrayList<Characs> characsList) {
		this.theHero = theHero;
		this.boardMap = boardMap;
		this.characsList = characsList;
	}

	public void keyWhatShouldHappen(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (theHero.posY > 0 && boardMap.getValue(theHero.posY - 1, theHero.posX) == 0) {
				theHero.movingUp();
			} else theHero.turnDown();
		}	else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (theHero.posY < 9 && boardMap.getValue(theHero.posY + 1, theHero.posX) == 0) {
					theHero.movingDown();
				} else theHero.turnUp();
		}   else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (theHero.posX < 9 && boardMap.getValue(theHero.posY, theHero.posX + 1) == 0) {
				theHero.movingRight();
			} else theHero.turnLeft();
		}	else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (theHero.posX > 0 && boardMap.getValue(theHero.posY, theHero.posX -1) == 0) {
				theHero.movingLeft();
			} else theHero.turnRight();
		}	else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				theHero.fight(checkEnemy());
		}	else if (e.getKeyCode() == KeyEvent.VK_M) {
				Path saveFile = Paths.get("../assets/save.txt");
				List<String> list = new ArrayList<>();
				String save = "";
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < characsList.size(); i++) {
					sb.append(characsList.get(i).currentHP);
					save = save + sb.toString();
				}
			System.out.println(save);
			try {
				Files.write(saveFile, list);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public Characs checkEnemy() {
		for (int i = 1; i < characsList.size(); i++) {
			if (characsList.get(i).posX == theHero.posX && characsList.get(i).posY == theHero.posY) {
				return characsList.get(i);
			}
		}
		return null;
	}

}
