import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowGrids {
	public static void mainDraw(Graphics graphics) {

		graphics.setColor(Color.yellow);
		graphics.fillRect(0, 0, 600, 600);
		graphics.setColor(Color.black);

		drawingRecursiveRect(0, 600 / 3, 600 / 3, graphics);          				//leftBox
		drawingRecursiveRect(600 / 3,0, 600 / 3, graphics); 									//upperBox
		drawingRecursiveRect(2 * 600 / 3, 600 / 3, 600 / 3, graphics); 				//rightBox
		drawingRecursiveRect(600 / 3, 2 * 600 / 3, 600 / 3, graphics);			 	//lowerBox

	}

	public static void drawingRecursiveRect(int x, int y, int size, Graphics graphics) {
		if (size < 1) {
			return;
		}
			graphics.drawRect(x, y, size, size);
			drawingRecursiveRect(x, y + size / 3, size / 3, graphics);										//leftBoxRecursion
			drawingRecursiveRect(x + size / 3, y, size / 3, graphics);										//upperBoxRecursion
			drawingRecursiveRect(x + 2 * size / 3, y + size / 3, size / 3, graphics);	//rightBoxRecursion
			drawingRecursiveRect(x + size / 3, y + 2 * size / 3, size / 3, graphics);	//lowerBoxRecursion
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

