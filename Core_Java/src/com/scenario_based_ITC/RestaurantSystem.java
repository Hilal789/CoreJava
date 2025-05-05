package com.scenario_based_ITC;

public class RestaurantSystem {

	public static void main(String[] args) throws InterruptedException {

		Restaurant restaurant = new Restaurant("ITC Royal");
		System.out.println("Welcome to "+restaurant.getName()+" Restaurant!!!");
		Waiter waiter = new Waiter(restaurant,"Fried Chicken");
//		waiter.acceptOrder("KFC Chicken");
		Chef chef = new Chef(restaurant);

		waiter.start();
		chef.start();
		//waiter.join();
	}

}
