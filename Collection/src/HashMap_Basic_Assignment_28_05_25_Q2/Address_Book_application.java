package HashMap_Basic_Assignment_28_05_25_Q2;

import java.util.HashMap;
import java.util.Scanner;

public class Address_Book_application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Long> list = new HashMap<String, Long>();
		while (true) {

			System.out.println("1. Add Contact\r\n" + "2. Remove Contact\r\n" + "3. Exit\r\n" + "4. Display Contact\n");
			System.out.print("Enter your choice: ");
			int inp = Integer.parseInt(sc.next());

			switch (inp) {
			case 1:
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("Enter Contact : ");
				Long contact = Long.parseLong(sc.next());
				list.put(name, contact);
				System.out.println(name + " added sucessfully with " + contact);
				break;
			case 2:
				System.out.println("Enter Name   whose contact they want to remove :");
				String removeStudent = sc.nextLine();
				removeStudent = sc.nextLine();
				if (list.isEmpty()) {
					System.err.println("Contact book is empty");
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
