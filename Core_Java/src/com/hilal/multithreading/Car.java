package com.hilal.multithreading;

public class Car implements Runnable {
	private String carName;
	private PetrolPump petrolPump;
	
	public Car(String carName, PetrolPump petrolPump) {
		super();
		this.carName = carName;
		this.petrolPump = petrolPump;
	}

	@Override
	public  void run() {
		petrolPump.refillCar(carName);
		
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", petrolPump=" + petrolPump + "]";
	}
	
	
}
