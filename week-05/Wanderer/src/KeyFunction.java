import java.awt.event.KeyEvent;
import java.util.ArrayList;

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
		}
	}

	public Characs checkEnemy() {
		for (int i = 1; i < characsList.size(); i++) {
			if (characsList.get(i).posX == theHero.posX && characsList.get(i).posY == theHero.posY) {
				System.out.println(characsList.get(i).typeInfo);
				return characsList.get(i);
			}
		}
		return null;
	}

}
