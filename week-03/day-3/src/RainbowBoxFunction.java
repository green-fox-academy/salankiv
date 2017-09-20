import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
	public static void mainDraw(Graphics graphics) {
		// create a square drawing function that takes 2 parameters:
		// the square size, and the fill color,
		// and draws a square of that size and color to the center of the canvas.
		// create a loop that fills the canvas with rainbow colored squares.

		int size = 320;
		ArrayList<Color> colorList = new ArrayList<>(Arrays.asList(BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW));
		squareDrawing(size, colorList, graphics);

	}

	public static void squareDrawing(int size, ArrayList<Color> colorList, Graphics graphics) {
		for (int i = 0; i < 13; i++) {
			graphics.setColor(colorList.get(i));
			graphics.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
			size = size - 20;
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
