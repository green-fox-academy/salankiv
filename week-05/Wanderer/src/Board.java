import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board extends JComponent implements KeyListener {

	ArrayList<Characs> characsList;
	BoardMap boardMap;
	ArrayList<Floor> floorList;
	ArrayList<Wall> wallList;
	KeyFunction keyFunction;
	Hud heroHud;

	public Board() {
		// set the size of your draw board
		setPreferredSize(new Dimension(720, 850));
		setVisible(true);
		characsList = new ArrayList<>();
		boardMap = new BoardMap();
		floorList = new ArrayList<>();
		wallList = new ArrayList<>();
	}

	public void fillList(){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (boardMap.getValue(i, j) == 0) {
					Floor floor = new Floor(j, i);
					floorList.add(floor);
				} else {
					Wall wall = new Wall(j, i);
					wallList.add(wall);
				}
			}
		}
	}

	public void createCharacs(int numberOfSkeletons) {
		Hero theHero = new Hero();
		characsList.add(theHero);
		heroHud = new Hud(theHero);
		keyFunction = new KeyFunction(theHero, boardMap);
		for (int i = 0; i < numberOfSkeletons; i++) {
			Skeleton skeleton = new Skeleton(boardMap);
			characsList.add(skeleton);
		}
		Boss theBoss = new Boss(boardMap);
		characsList.add(theBoss);
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		// here you have a 720x720 canvas
		// you can create and draw an image using the class below e.g.

		if (floorList.size() == 0 || wallList.size() == 0) {
			fillList();
		}
		for (int i = 0; i < floorList.size(); i++) {
			floorList.get(i).draw(graphics);
		}
		for (int i = 0; i < wallList.size(); i++) {
			wallList.get(i).draw(graphics);
		}

		if (characsList.size() == 0) {
			createCharacs(3);
		}
		for (int i = 0; i < characsList.size(); i++) {
			characsList.get(i).draw(graphics);
		}

		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 720, 720, 130);
		graphics.setColor(Color.BLACK);
		Font myFont = new Font("Arial", 3, 24);
		graphics.setFont(myFont);
		graphics.drawString(heroHud.getHud(), 10, 740);
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
//	public void keyTyped(KeyEvent e) {
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	// But actually we can use just this one for our goals here
	@Override
	public void keyReleased(KeyEvent e) {
	keyFunction.keyWhatShouldHappen(e);
/*			// When the up or down keys hit, we change the position of our box
		if (e.getKeyCode() == KeyEvent.VK_UP && boardMap.getValue(theHero.posY - 1, theHero.posX) == 0) {
			theHero.movingUp();
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN && boardMap.getValue(theHero.posY + 1, theHero.posX) == 0) {
			theHero.movingDown();
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT && boardMap.getValue(theHero.posY, theHero.posX + 1) == 0) {
			theHero.movingRight();
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT && boardMap.getValue(theHero.posY, theHero.posX -1) == 0) {
			theHero.movingLeft();
		}
		// and redraw to have a new picture with the new coordinates
*/		repaint();
	}

}