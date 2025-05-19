package Second_Largest_Element;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int Size = sc.nextInt();

		int arr[] = new int[Size];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("------------");
		System.out.println("Your entered array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

		System.out.println("\n-------");

		if (Size < 2) {
			System.out.println("Array should have at least two elements.");
		} else {
			int largest = Integer.MIN_VALUE;
			int secondLargest = Integer.MIN_VALUE;

			for (int num : arr) {
				if (num > largest) {
					secondLargest = largest;
					largest = num;
				} else if (num > secondLargest && num < largest) {
					secondLargest = num;
				}
			}

			System.out.println("Second Largest Element is: " + secondLargest);
		}

		sc.close();
	}
}