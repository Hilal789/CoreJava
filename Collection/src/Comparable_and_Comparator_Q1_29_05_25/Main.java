package Comparable_and_Comparator_Q1_29_05_25;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Product> pro = new ArrayList<Product>();
		pro.add(new Product(123, "Mobile", 34000.00));
		pro.add(new Product(123, "SHoe", 34000.00));
		pro.add(new Product(123, "Airpods", 34000.00));
		pro.add(new Product(123, "Bag", 34000.00));
		
		Collections.sort(pro);
	
		pro.forEach((val)->System.out.println(val));
	
	}

}
