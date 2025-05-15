package Array_Add_LastAndFirst_15_05_25;

import java.util.Scanner;

public class AddLastAndFirst {

	public static void Adding(int arr[]) {
		int sum = 0;

		sum = arr[0] + arr[arr.length - 1];

		System.out.println("Sum is :" + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array Element: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element index " + i + "=");
			arr[i] = sc.nextInt();
		}
		Adding(arr);

	}

}
