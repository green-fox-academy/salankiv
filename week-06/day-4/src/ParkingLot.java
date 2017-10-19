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
						if (cars.get(i).color.equals(carColors[k])) {
							carTypeAndColor[j][k]++;
						}
					}
				}
			}
		}

		int sumCars = 0;
		for (int i = 0; i < carTypes.length; i++) {
			for (int j = 0; j < carColors.length; j++) {
				sumCars += carTypeAndColor[i][j];
			}
			System.out.println(carTypes[i] + " = " + sumCars);
			sumCars = 0;
		}

		System.out.println();

		int sumColors = 0;
		for (int i = 0; i < carColors.length; i++) {
			for (int j = 0; j < carTypes.length; j++) {
				sumColors += carTypeAndColor[j][i];
			}
			System.out.println(carColors[i] + " = " + sumColors);
			sumColors = 0;
		}

		System.out.println();

		int maxRow = 0;
		int maxCol = 0;
		int maxValue = 0;
		for (int i = 0; i < carTypes.length; i++) {
			for (int j = 0; j < carColors.length; j++) {
				if (carTypeAndColor[i][j] > maxValue) {
					maxValue = carTypeAndColor[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		System.out.println(carTypes[maxRow] + " " + carColors[maxCol] + " = " + carTypeAndColor[maxRow][maxCol]);
	}

}
