import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics){
		// draw four different size and color rectangles.

		for (int i = 1; i < 5; i++) {
			graphics.setColor(new Color(i*40,i*5,i*60));
			graphics.drawLine(i*10, i*10, i*110, i*10);
			graphics.drawLine(i*110, i*10, i*110, i*110);
			graphics.drawLine(i*10, i*110, i*110, i*110);
			graphics.drawLine(i*10, i*10, i*10, i*110);
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
