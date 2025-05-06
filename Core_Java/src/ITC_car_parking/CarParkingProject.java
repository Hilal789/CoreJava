package ITC_car_parking;

public class CarParkingProject {

	public static void main(String[] args) {

		ParkingGarage park = new ParkingGarage(5);

		Car car = new Car(park, "Maruti");
		Car car1 = new Car(park, "Suzuki");
		Car car2 = new Car(park, "Hundai");
		Car car3 = new Car(park, "Baleno");
		Car car4 = new Car(park, "THar");
		Car car5 = new Car(park, "s");
		
		System.out.println("Welcome to D-Mart Parking");
		System.out.println("Total Available spots are " + park.MAX_SPOTS);

		Thread t = new Thread(car);
		Thread t1 = new Thread(car1);
		Thread t2 = new Thread(car2);
		Thread t3 = new Thread(car3);
		Thread t4 = new Thread(car4);
		Thread t5 = new Thread(car5);
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
