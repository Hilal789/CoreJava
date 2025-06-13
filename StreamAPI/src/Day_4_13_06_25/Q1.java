package Day_4_13_06_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Person(String name,Integer age) {
	
}


public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();

		System.out.println("Enter number of persons:");
		int numOfp = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <=numOfp; i++) {
			System.out.println("Enter name of person " + i + ": ");
			 //sc.nextLine();
			 String name  = sc.nextLine();
			System.out.println("Enter age of person " + i + ": ");
			int age =Integer.parseInt(sc.nextLine());
			list.add(new Person(name, age));
			
			

		}
		System.out.println("Sorted by age (ascending):");
		
		list.stream().sorted((p1,p2)->p1.age()-p2.age()).forEach(p-> System.out.println(p.name()+"("+p.age()+")"));
		
		
		

	}

}
