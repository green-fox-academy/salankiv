public class Car {

	public enum Type {
		TOYOTA, NISSAN, MAZDA, OPEL, VOLKSWAGEN, FORD
	}

	public enum Color {
		RED, WHITE, BLUE, YELLOW, GREEN
	}

	Type type;
	Color color;

	public Car() {
		this.type = Type.values()[(int) (Math.random() * 6)];
		this.color = Color.values()[(int) (Math.random() * 5)];
	}
}

