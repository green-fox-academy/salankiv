import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
	public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

		squareDrawing(10, 10, graphics);
		squareDrawing(100, 10, graphics);
		squareDrawing(10, 100, graphics);
    }

	public static void squareDrawing(int x, int y, Graphics graphics) {
		graphics.drawLine(x, y, x + 50, y);
		graphics.drawLine(x + 50, y, x + 50, y + 50);
		graphics.drawLine(x, y + 50, x + 50, y + 50);
		graphics.drawLine(x, y, x, y + 50);
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
