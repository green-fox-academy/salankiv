public class Sharpie {

	String color;
	float width;
	float inkAmount;

	public Sharpie(String color, float width) {
		this.color = color;
		this.width = width;
		inkAmount = 100;
	}

	public void use() {
		inkAmount -= 10;
	}

	public static void main(String[] args) {

		Sharpie myToll = new Sharpie("blue", 10);
		myToll.use();

		System.out.println(myToll.inkAmount);
		System.out.println(myToll.color);

	}

}