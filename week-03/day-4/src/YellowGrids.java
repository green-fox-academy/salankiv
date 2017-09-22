import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowGrids {
	public static void mainDraw(Graphics graphics){

		graphics.setColor(Color.yellow);
		graphics.fillRect(0,0,600,600);
		graphics.setColor(Color.black);

		for (int i = 0; i <= 2; i++) {
			graphics.drawRect(i * WIDTH / 3, HEIGHT / 3, WIDTH / 3, HEIGHT / 3);
			graphics.drawRect(WIDTH / 3, i * HEIGHT / 3, WIDTH / 3, HEIGHT / 3);
		}

		for (int i = 1; i <= 2; i++) {
			graphics.drawRect(i * WIDTH / 3, HEIGHT / 3, WIDTH / 3, HEIGHT / 3);
			graphics.drawRect(WIDTH / 3, i / 2 * HEIGHT / 3, WIDTH / 3, HEIGHT / 3);
		}


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

