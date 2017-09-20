import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
	public static void mainDraw(Graphics graphics){
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

		ArrayList<int[]> boxList = new ArrayList<>();
		int[] topLeft = {10, 10};
		int[] topRight = {290, 10};
		int[] bottomLeft = {290, 290};
		int[] bottomRight = {10, 290};
		boxList.add(topLeft);
		boxList.add(topRight);
		boxList.add(bottomLeft);
		boxList.add(bottomRight);

		ArrayList<int[]> dotList = new ArrayList<>();
		int[] pair1 = {50, 100};
		int[] pair2 = {70, 70};
		int[] pair3 = {80, 90};
		int[] pair4 = {90, 90};
		int[] pair5 = {100, 70};
		int[] pair6 = {120, 100};
		int[] pair7 = {85, 130};
		int[] pair8 = {50, 100};
		dotList.add(pair1);
		dotList.add(pair2);
		dotList.add(pair3);
		dotList.add(pair4);
		dotList.add(pair5);
		dotList.add(pair6);
		dotList.add(pair7);
		dotList.add(pair8);

		graphics.setColor(Color.GREEN);
		connectingDots(boxList, graphics);
		connectingDots(dotList, graphics);
  }

  public static void connectingDots (ArrayList<int[]> inputList, Graphics graphics) {
		for (int i = 0; i < inputList.size(); i++) {
			if (i < inputList.size() - 1) {
				int[] innerList = inputList.get(i);
				int x1 = innerList[0];
				int y1 = innerList[1];
				innerList = inputList.get(i + 1);
				int x2 = innerList[0];
				int y2 = innerList[1];
				graphics.drawLine(x1, y1, x2, y2);
			} else {
					int[] innerList = inputList.get(i);
					int x1 = innerList[0];
					int y1 = innerList[1];
					innerList = inputList.get(0);
					int x2 = innerList[0];
					int y2 = innerList[1];
					graphics.drawLine(x1, y1, x2, y2);
				}
		}
	}

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}


// create a 300x300 canvas.
