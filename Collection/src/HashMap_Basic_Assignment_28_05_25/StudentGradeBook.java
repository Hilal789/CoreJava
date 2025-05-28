package HashMap_Basic_Assignment_28_05_25;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> list = new HashMap<String, String>();
		while(true)
		{
			
		System.out.println("1. Add Student Grade\r\n" + "2. Remove Student Grade\r\n" + "3. Exit\r\n" + "4. Display\n");
		System.out.print("Enter your choice: ");
		int inp = Integer.parseInt(sc.next());

		switch (inp) {
		case 1:
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter Student Grade: ");
			String grade = sc.nextLine();
			list.put(name, grade);
			System.out.println("Sudent" + name + " added sucessfully with " + grade);
			break;
		case 2:
			System.out.println("Enter Name of Student  whose grade they want to remove :");
			String removeStudent = sc.nextLine();
			 removeStudent = sc.nextLine();
			if (list.isEmpty()) {
				System.err.println("Grade book is empty");
			} else if (list.containsKey(removeStudent)) {
				list.remove(removeStudent);
				System.out.println("Remove Sucessfully");
			}

			break;
		case 3:
				System.exit(0);
				break;
		case 4:
				System.out.println("--------------------------");
				System.out.println(list);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + inp);
		}
		}

	}

}
