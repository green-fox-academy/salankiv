public class Station {

	int gasAmount = 1000;

	public void refillCar(Car car) {
		gasAmount -= car.capacity;
		car.gasAmount += car.capacity;
	}

	public static void main(String[] args) {
		Car newCar = new Car();
		Station newStation = new Station();
		System.out.println(newCar.capacity);
		System.out.println(newCar.gasAmount);

		newStation.refillCar(newCar);

		System.out.println("Station gasAmount: " + newStation.gasAmount);
		System.out.println("Car gasAmount: " + newCar.gasAmount);
		System.out.println("Car capacity: "+ newCar.capacity);
	}

}
