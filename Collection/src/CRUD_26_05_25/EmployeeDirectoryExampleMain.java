package CRUD_26_05_25;

import java.util.Scanner;

public class EmployeeDirectoryExampleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee("Alic", "Manager", 4000);
		Employee emp2 = new Employee("Bob", "Devloper", 24000);
		Directory d = new Directory();
		
		d.addEmployee(emp1);
		d.addEmployee(emp2);
		d.displayAllEmployees();
		d.updateEmployee();
		
		
		
		
		
	}

}
