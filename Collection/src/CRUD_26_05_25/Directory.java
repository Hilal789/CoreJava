package CRUD_26_05_25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Directory {
	ArrayList<Employee> list = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);

	public void addEmployee(Employee emp) {
		list.add(emp);
	}

	public void displayAllEmployees() {
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

	public void updateEmployee() {

		System.out.println("Enter index to Update Employee Details: ");
		int ind = sc.nextInt();

		Employee emp = list.get(ind-1);
		System.out.println("Based on Index Employee Data");
		System.out.println(emp);
		System.out.println("Enter Name to Update");
		String name = sc.nextLine();
		name = sc.nextLine();
		if(name.equalsIgnoreCase("NA"))
		{
			
		}
		else
		{
			emp.setName(name);			
		}
		System.out.println("===========Updated Data==============");
		System.out.println(emp);

	}
	
	public void deleteEmployee() {
		System.out.println("Enter index to delete Employee Details: ");
		int ind = sc.nextInt();
		
		list.remove(ind);
		
		
	}
}
