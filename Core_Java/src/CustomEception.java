import java.awt.font.GraphicAttribute;

public class CustomEception {

	public static void main(String[] args) throws CarStoppedException {

		try {
			CarTest.stop("stop");

		} catch (CarStoppedException e) {

			System.out.println(e.getMessage());
		}

		try {
			CarTest.puncture("puncture");
		} catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		}

		try {
			CarTest.carHeat(50);
		} catch (CarHeatException e) {
			System.out.println(e.getMessage());
		}
	}

}

class CarStoppedException extends Exception {

	public CarStoppedException() {
		super();

	}

	public CarStoppedException(String message) {
		super(message);

	}

}

class CarPunctureException extends Exception {

	public CarPunctureException() {
		super();
	}

	public CarPunctureException(String message) {
		super(message);
	}

}

class CarHeatException extends Exception {

	public CarHeatException() {
		super();
	}

	public CarHeatException(String message) {
		super(message);
	}

}

/* Test */

class CarTest {
	static void stop(String s) throws CarStoppedException {
		if (s.equalsIgnoreCase("Stop")) {
			throw new CarStoppedException("Car Stopped");
		} else {
			System.out.println("Car is  running");
		}
	}

	public static void puncture(String p) throws CarPunctureException {
		if (p.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		} else {
			System.out.println("Car is Not Puncture");
		}
	}

	public static void carHeat(int h) throws CarHeatException, CarStoppedException {
		if (h >= 50) {
			stop("Stop");
			throw new CarHeatException("Car is Heat");
		} else {
			System.out.println("Car is Not Heat...");
		}
	}

}
