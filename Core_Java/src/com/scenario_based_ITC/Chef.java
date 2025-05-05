package com.scenario_based_ITC;

public class Chef extends Thread {

	private Restaurant restaurant;

	public Chef(Restaurant restaurant) {

		this.restaurant = restaurant;
	}

	public void run() {

		restaurant.prepareOrder();
	}
}
