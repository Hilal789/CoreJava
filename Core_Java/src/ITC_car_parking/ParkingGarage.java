package ITC_car_parking;

public class ParkingGarage {

	int availableSpots;
	final int MAX_SPOTS;

	public ParkingGarage(int max) {
		super();
		this.availableSpots = max;
		this.MAX_SPOTS = max;
	}

	public synchronized void parkCar(String carName) {

		if (availableSpots == 0 && availableSpots <= MAX_SPOTS) {
			try {
				System.out.println(carName + " is waiting for a spot.");
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		availableSpots--;

		System.out.print(carName + " has been parked :");
		System.out.println("Available spots " + availableSpots);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}

	public synchronized void freeSpot(String carName) {
		if (availableSpots > 0 && availableSpots <= MAX_SPOTS) {

			availableSpots++;
			System.out.println(carName + " left. Available spots: " + availableSpots);
			notify();
		} else {
			try {
				System.out.println("already free");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public int getAvailableSpots() {
		return availableSpots;
	}

}
