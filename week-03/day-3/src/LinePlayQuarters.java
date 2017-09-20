import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
	public static void mainDraw(Graphics graphics){
		// divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

		graphics.setColor(Color.DARK_GRAY);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(i * 10, 5, 155, i * 10);
		}

		graphics.setColor(Color.GREEN);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(5, i * 10, i * 10, 168);
		}

		graphics.setColor(Color.DARK_GRAY);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(i * 10, 173, 155, 173 + i * 10);
		}

		graphics.setColor(Color.GREEN);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(5, 173 + i * 10, i * 10, 338);
		}

		graphics.setColor(Color.DARK_GRAY);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(155 + i * 10, 173, 315, 173 + i * 10);
		}

		graphics.setColor(Color.GREEN);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(155, 173 + i * 10, 155 + i * 10, 338);
		}

		graphics.setColor(Color.DARK_GRAY);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(155 + i * 10, 5, 315, i * 10);
		}

		graphics.setColor(Color.GREEN);
		for (int i = 1; i < 16 ; i++) {
			graphics.drawLine(155, i * 10, 155 + i * 10, 168);
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
