package Array_Reverse_order_15_05_25;

import java.util.Scanner;

public class ArrayReverse {

	public static void reverse(int arr[]) {
		System.out.print("Reverse: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
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
		
		
		reverse(arr);
	}

}
