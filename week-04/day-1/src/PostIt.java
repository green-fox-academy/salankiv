import java.awt.*;

public class PostIt {
	Color backgroundColor;
	String text;
	Color textColor;

public  PostIt() {
}

public PostIt(Color colorOfBackground, String whatIsTheText, Color colorOfText) {
	this.backgroundColor = colorOfBackground;
	this.text = whatIsTheText;
	this.textColor = colorOfText;
	}
}

class GiveMeColors {
	public static void main(String[] args) {
		PostIt orange = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
		System.out.println(orange.backgroundColor);

		PostIt pink = new PostIt();
		pink.backgroundColor = Color.PINK;
		pink.text = "Awesome!";
		pink.textColor = Color.BLACK;
		System.out.println(pink.backgroundColor);

		PostIt yellow = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
		System.out.println(yellow.text);
	}
}
