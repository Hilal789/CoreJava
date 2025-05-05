package com.scenario_based_ITC;

public class Restaurant {
	private String name;
	private String order;
	private boolean isOrderReady = false;

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public synchronized void placeOrder(String order) {
		this.order = order;
		try {
		
			System.out.println("Placed order for "+order);
			if (!isOrderReady) {
				wait();
			}
			System.out.println("Serving the "+order);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

	public synchronized void prepareOrder() {
		if(!isOrderReady)
		{
		try {
			System.out.println("Preparing "+order);
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.isOrderReady = true;
		System.out.println(order +" fried chicken is ready");
	}
		notify();
	}
	public String getName() {
		return name;
	}

}
