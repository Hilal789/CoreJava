package Day_4_13_06_25;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of persons:");
		int numOfp = Integer.parseInt(sc.next());

		for (int i = 0; i < numOfp; i++) {
			System.out.println("Enter name of person " + i + ": ");
			String name = sc.nextLine();
			System.out.println("Enter age of person " + i + ": ");
			int age = sc.nextInt();

		}
		
		
		

	}

}
