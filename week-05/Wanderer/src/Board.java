import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JComponent implements KeyListener {

	Hero theHero;

	public Board() {
		// set the size of your draw board
		setPreferredSize(new Dimension(720, 720));
		setVisible(true);
		theHero = new Hero();
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		// here you have a 720x720 canvas
		// you can create and draw an image using the class below e.g.

		PositionedImage imageFloor = new PositionedImage("./assets/floor.png", 0,0);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				imageFloor.posX = i * 72;
				imageFloor.posY = j *72;
				imageFloor.draw(graphics);
			}

		}

		PositionedImage imageWall = new PositionedImage("./assets/wall.png", 0,0);
		ArrayList<Integer> wallListX = new ArrayList<>(Arrays.asList(3,5,3,5,7,8,1,2,3,5,7,8,5,0,1,2,3,5,6,7,8,1,3,8,1,3,5,6,8,5,6,8,1,2,3,8,3,5,6));
		ArrayList<Integer> wallListY = new ArrayList<>(Arrays.asList(0,0,1,1,1,1,2,2,2,2,2,2,3,4,4,4,4,4,4,4,4,5,5,5,6,6,6,6,6,7,7,7,8,8,8,8,9,9,9));
		for (int i  = 0; i < wallListX.size(); i++) {
			imageWall.posX = wallListX.get(i) * 72;
			imageWall.posY = wallListY.get(i) * 72;
			imageWall.draw(graphics);
		}

		theHero.draw(graphics);

	}

	public static void main(String[] args) {
		// Here is how you set up a new window and adding our board to it
		JFrame frame = new JFrame("RPG Game");
		Board board = new Board();
		frame.add(board);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		// Here is how you can add a key event listener
		// The board object will be notified when hitting any key
		// with the system calling one of the below 3 methods
		frame.addKeyListener(board);
		// Notice (at the top) that we can only do this
		// because this Board class (the type of the board object) is also a KeyListener
	}

	// To be a KeyListener the class needs to have these 3 methods in it
	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	// But actually we can use just this one for our goals here
	@Override
	public void keyReleased(KeyEvent e) {
		// When the up or down keys hit, we change the position of our box
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			theHero.posY -= 72;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			theHero.posX += 72;
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			theHero.posX += 72;
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			theHero.posX -= 72;
		}
		// and redraw to have a new picture with the new coordinates
		repaint();
	}

}