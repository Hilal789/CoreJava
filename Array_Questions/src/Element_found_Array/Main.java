package Element_found_Array;

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
		System.out.println();

		System.out.print("Enter which element you find : ");
		int ele = sc.nextInt();
		boolean flag = false;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				flag = true;
				index = i;
			}
		}
		if(flag) {
			System.out.println("Element is found at "+index);
		}else {
			System.out.println("Element is not found ");
		}

	}

}
