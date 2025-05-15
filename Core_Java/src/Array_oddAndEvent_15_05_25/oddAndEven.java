package Array_oddAndEvent_15_05_25;

import java.util.Scanner;

public class oddAndEven {

	public static void printOddAndEven(int arr[]) {
		System.out.println("Even elements are :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Odd elements are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
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
		printOddAndEven(arr);

	}

}
