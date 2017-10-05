import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

	ArrayList<Characs> characsList;
	BoardMap boardMap;
	ArrayList<Floor> floorList;
	ArrayList<Wall> wallList;
	KeyFunction keyFunction;
	Hud theHud;

	public Board() {
		setPreferredSize(new Dimension(720, 800));
		setVisible(true);
		characsList = new ArrayList<>();
		boardMap = new BoardMap();
		floorList = new ArrayList<>();
		wallList = new ArrayList<>();
		theHud = new Hud();
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
		keyFunction = new KeyFunction(theHero, boardMap);
		for (int i = 0; i < numberOfSkeletons; i++) {
			Skeleton skeleton = new Skeleton(boardMap.getNotWallCoords());
			characsList.add(skeleton);
		}
		Boss theBoss = new Boss(boardMap.getNotWallCoords());
		characsList.add(theBoss);
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);

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

		theHud.drawHud(graphics);
		theHud.getHudInfo(characsList.get(0), graphics);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("RPG Game");
		Board board = new Board();
		frame.add(board);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(board);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyFunction.keyWhatShouldHappen(e);
		repaint();
	}

}