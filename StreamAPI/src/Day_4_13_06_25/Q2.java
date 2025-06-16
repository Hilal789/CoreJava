package Day_4_13_06_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Employee(Integer id, String name, Double salary) {

}

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter number of employees: ");
		int NoOfEmp = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= NoOfEmp; i++) {
			System.out.println("Enter ID of employee " + i + ": ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter name of employee " + i + ": ");
			String name = sc.nextLine();
			System.out.println("Enter salary of employee " + i + " :");
			double salary = Double.parseDouble(sc.nextLine());
				
			list.add(new Employee(id, name, salary));
			
			
		}	
		list.stream().filter(s->s.salary()>30000).forEach(System.out::print);

	}

}
