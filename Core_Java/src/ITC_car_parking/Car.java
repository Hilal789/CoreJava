package ITC_car_parking;

public class Car implements Runnable {

	ParkingGarage garage;
	String carName;

	public Car(ParkingGarage garage, String carName) {
		super();
		this.garage = garage;
		this.carName = carName;
	}

	@Override
	public void run() {

		try {
			garage.parkCar(carName);
//			Thread.sleep(100);
			garage.freeSpot(carName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
