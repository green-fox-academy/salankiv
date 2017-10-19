import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLot {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < 256; i++) {
			cars.add(new Car());
		}

		Car.Type[] carTypes = Car.Type.values();
		Car.Color[] carColors = Car.Color.values();
		int[][] carTypeAndColor = new int[carTypes.length][carColors.length];
		for (int i = 0; i < cars.size(); i++) {
			for (int j = 0; j < carTypes.length; j++) {
				if (cars.get(i).type.equals(carTypes[j])) {
					for (int k = 0; k < carColors.length; k++) {
						if (cars.get(i).color.equals(carColors[k]));
						carTypeAndColor[j][k]++;
					}
				}
			}
		}
	}

}
