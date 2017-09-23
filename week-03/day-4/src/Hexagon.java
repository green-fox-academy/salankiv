import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
	public static void mainDraw(Graphics graphics) {

		int size = 210;
		int x1 = WIDTH / 25 + size;
		int x2 = x1 + size;
		int x3 = x1 + 3 * size / 2;
		int x4 = x1 + size;
		int x5 = x1;
		int x6 = x1 - size / 2;

		int y1 = HEIGHT / 30 + size;
		int y2 = y1;
		int y3 = (int) (y1 + Math.sqrt(3) * size / 2);
		int y4 = (int) (y1 + Math.sqrt(3) * size);
		int y5 = (int) (y1 + Math.sqrt(3) * size);
		int y6 = (int) (y1 + Math.sqrt(3) * size / 2);

		int[] xOfTopLeft = {x1, x2, x3, x4, x5, x6};
		int[] yOfTopLeft = {y1, y2, y3, y4, y5, y6};

		int[] xOfBottomLeft = {x1, x2, x3, x4, x5, x6};
		int[] yOfBottomLeft = {(int) (y1 + Math.sqrt(3) * size / 2), (int) (y2 + Math.sqrt(3) * size / 2), (int) (y3 + Math.sqrt(3) * size / 2), (int) (y4 + Math.sqrt(3) * size / 2), (int) (y5 + Math.sqrt(3) * size / 2), (int) (y6 + Math.sqrt(3) * size / 2)};

		int[] xRight = {(int) (x1 + 3 * size / 4), (int) (x2 + size / 4), x3, (int) (x4 + size / 4), (int) (x5 + 3 * size / 4), x6 + size};
		int[] yRight = {(int) (y1 + Math.sqrt(3) * size / 4), (int) (y2 + Math.sqrt(3) * size / 4), y3, (int) (y4 - Math.sqrt(3) * size / 4), (int) (y5 - Math.sqrt(3) * size / 4), y6};

		drawRecursiveHex(xOfTopLeft, yOfTopLeft, 6, size,  graphics);
		drawRecursiveHex(xOfBottomLeft, yOfBottomLeft, 6, size / 2,  graphics);
		drawRecursiveHex(xRight, yRight, 6, size / 2, graphics);

	}

	private static void drawRecursiveHex(int[] x, int[] y, int i, int size, Graphics graphics) {
		if (size < 10) {
			return;
		}
		x[1] = x[0] + size;
		x[2] = x[0] + 3 * size / 2;
		x[3] = x[0] + size;
		x[4] = x[0];
		x[5] = x[0] - size / 2;

		y[1] = y[0];
		y[2] = (int) (y[0] + Math.sqrt(3) * size / 2);
		y[3] = (int) (y[0] + Math.sqrt(3) * size);
		y[4] = (int) (y[0] + Math.sqrt(3) * size);
		y[5] = (int) (y[0] + Math.sqrt(3) * size / 2);
		graphics.drawPolygon(x, y, i);

		drawRecursiveHex(x, y, 6, size / 2, graphics);

		int[] bottomY = {(int) (y[0] + Math.sqrt(3) * size / 2), (int) (y[1] + Math.sqrt(3) * size / 2), (int) (y[2] + Math.sqrt(3) * size / 2), (int) (y[3] + Math.sqrt(3) * size / 2), (int) (y[4] + Math.sqrt(3) * size / 2), (int) (y[5] + Math.sqrt(3) * size / 2)};
		drawRecursiveHex(x, bottomY, 6, size / 2, graphics);

		int[] rightX = {(int) (x[0] + 3 * size / 4), (int) (x[1] + size / 4), x[2], (int) (x[3] + size / 4), (int) (x[4] + 3 * size / 4), x[5] + size};
		int[] rightY = {(int) (y[0] + Math.sqrt(3) * size / 4), (int) (y[1] + Math.sqrt(3) * size / 4), y[2], (int) (y[3] - Math.sqrt(3) * size / 4), (int) (y[4] - Math.sqrt(3) * size / 4), y[5]};
		drawRecursiveHex(rightX, rightY, 6, size / 2, graphics);
	}


	//    Don't touch the code below
	static int WIDTH = 600;
	static int HEIGHT = 600;

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

