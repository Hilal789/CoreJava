package com.scenario_based_ITC;

public class Waiter extends Thread {

	private Restaurant restaurant;
	private String orderName;

	public Waiter(Restaurant restaurant, String orderName) {

		this.restaurant = restaurant;
		this.orderName=orderName;
	}

	public void acceptOrder(String orderName) {
		this.orderName = orderName;

	}

	@Override
	public void run() {
		restaurant.placeOrder(orderName);
	}

}
