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

/*
 * 
 *import java.util.*;

public class MiddleElementFinder {

    public static void findMiddleElement(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int mid = n / 2;

        if (n % 2 == 1) {
            // Odd length - one middle element
            System.out.println("Middle element: " + arr[mid]);
        } else {
            // Even length - two middle elements
            System.out.println("Middle elements: " + arr[mid - 1] + ", " + arr[mid]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};          // Output: Middle element: 2
        int[] arr2 = {10, 20, 30, 40};   // Output: Middle elements: 20, 30

        findMiddleElement(arr1);
        findMiddleElement(arr2);
    }
}
*/
