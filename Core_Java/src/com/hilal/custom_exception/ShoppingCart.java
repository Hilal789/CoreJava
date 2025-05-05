package com.hilal.custom_exception;

public class ShoppingCart {
	Product[] product = new Product[10];
	int itemCount;
	static int index = 0;

	public ShoppingCart(int capacity) {

		this.product = new Product[capacity];

	}

	public void addToCart(Product p, int qua) throws InsufficientQuantityException {
		if (p.quentity < qua) {
			throw new InsufficientQuantityException(" not found");
		} else {
			while (qua != 0) {
				Product[] cartItem = null;
				cartItem[itemCount++] = p;

			}

			product[index++] = p;
			System.out.println("");
		}
		
	}

	public double calculateTotal() {

		double cost = 0;
		for (int i = 0; i < product.length; i++) {
			cost += product[i].getPrice();
		}
		return cost;
	}
}
