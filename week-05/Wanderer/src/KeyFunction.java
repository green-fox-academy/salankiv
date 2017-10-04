import java.awt.event.KeyEvent;

public class KeyFunction {
	Hero theHero;
	BoardMap boardMap;

	public KeyFunction(Hero theHero, BoardMap boardMap) {
		this.theHero = theHero;
		this.boardMap = boardMap;
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
		}
	}


}
