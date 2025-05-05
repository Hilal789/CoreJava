package com.hilal.custom_exception;

class InsufficientQuantityException extends Exception {
	public InsufficientQuantityException(String str) {
		super(str);
	}
}

class InvalidProductException extends Exception {
	public InvalidProductException(String str) {
		super(str);
	}
}

public class Product {
	int id;
	String name;
	double price;
	int quentity;

	public Product(int id, String name, double price, int quentity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quentity = quentity;
	}

	public void decreaseQuantity(int n) {
		quentity -= n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuentity() {
		return quentity;
	}

	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}

}
