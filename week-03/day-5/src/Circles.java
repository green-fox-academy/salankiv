import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
	public static void mainDraw(Graphics graphics) {
		graphics.setColor(Color.black);

		drawCircles(0,0,600, graphics);
	}

	private static void drawCircles(int x, int y, int size, Graphics graphics) {
		if (size < 20) {
			return;
		}
		graphics.drawOval(x,y,size,size);
		drawCircles(x + size / 4, y, size / 2, graphics);
		drawCircles(x + size / 64 * 2, (int) (y + size / 16 * 6), size / 2, graphics);
		drawCircles(x + (int) (size / 64 * 33), y + (int) (size / 16 * 6), size / 2, graphics);
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