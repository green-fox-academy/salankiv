import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JComponent implements KeyListener {

	Hero theHero;
	BoardPosition boardPosition;
	ArrayList<Floor> floorList;
	ArrayList<Wall> wallList;

	public Board() {
		// set the size of your draw board
		setPreferredSize(new Dimension(720, 720));
		setVisible(true);
		theHero = new Hero();
		boardPosition = new BoardPosition();
		floorList = new ArrayList<>();
		wallList = new ArrayList<>();
	}

	public void fillList(){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (boardPosition.getValue(i, j) == 0) {
					Floor floor = new Floor(j, i);
					floorList.add(floor);
				} else {
					Wall wall = new Wall(j, i);
					wallList.add(wall);
				}
			}
		}
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		// here you have a 720x720 canvas
		// you can create and draw an image using the class below e.g.

		if (floorList.size() == 0) {
			fillList();
		}

		for (int i = 0; i < floorList.size(); i++) {
			floorList.get(i).draw(graphics);
		}

		for (int i = 0; i < wallList.size(); i++) {
			wallList.get(i).draw(graphics);
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
		if (e.getKeyCode() == KeyEvent.VK_UP && boardPosition.getValue(theHero.posY - 1, theHero.posX) == 0) {
			theHero.posY -= 1;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN && boardPosition.getValue(theHero.posY + 1, theHero.posX) == 0) {
			theHero.posY += 1;
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT && boardPosition.getValue(theHero.posY, theHero.posX + 1) == 0) {
			theHero.posX += 1;
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT && boardPosition.getValue(theHero.posY, theHero.posX -1) == 0) {
			theHero.posX -= 1;
		}
		// and redraw to have a new picture with the new coordinates
		repaint();
	}

}