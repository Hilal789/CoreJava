package Comparable_and_Comparator_Q2_29_05_25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class MainCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> cus = new ArrayList<Customer>();
		cus.add(new Customer(123, "Hilal", 944700.00));
		cus.add(new Customer(121, "Rahul", 38000.00));
		cus.add(new Customer(342, "Aam", 340000.00));
		cus.add(new Customer(520, "Sonu", 74000.00));
		cus.forEach(System.out::println);
		
		
		System.out.println("by using implements");
		Customer customer = new Customer();
		Collections.sort(cus, customer);
		cus.forEach(System.out::println);
		
		
		System.out.println("by using lembda");
		Comparator<Customer> a = (o1, o2) -> o1.getCustomerName().compareTo(o2.getCustomerName());
		Collections.sort(cus, a);
		cus.forEach(System.out::println);

		System.out.println("Based on customer bill");
		
		Collections.sort(cus,(c1,c2)->{
			return (int)(c2.getCustomerBill()-c1.getCustomerBill());
		});
		cus.forEach((val)->System.out.println(val));
	}

}
