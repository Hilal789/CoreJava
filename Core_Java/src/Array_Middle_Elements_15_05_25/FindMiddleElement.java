package Array_Middle_Elements_15_05_25;

import java.util.Scanner;

public class FindMiddleElement {

	public static void MiddleElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length % 2 == 0) {
				System.out.println(arr[(arr.length / 2) - 1] + " ," + arr[(arr.length / 2)]);
				break;
			} else {
				System.out.println(arr[arr.length / 2]);
				break;
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
		MiddleElement(arr);

	}

}
