package Comparable_and_Comparator_Q2_29_05_25;

import java.util.Comparator;


public class Customer implements Comparator<Customer> {

	private Integer customerNumber;
	private String customerName;
	private Double customerBill;

	Customer(){
		
	}
	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	

	public Integer getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Double getCustomerBill() {
		return customerBill;
	}



	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}



	@Override
	public int compare(Customer o1, Customer o2) {
		
		
		return o1.customerNumber.compareTo(o2.customerNumber);
	}



	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

}
