package Array_Search_Element_15_05_25;

import java.util.Scanner;

public class SearchArrayIndex {

	public static void SearchIndex(int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				System.out.println(" Element found at index " + i);
				return;
			}
			}
			
				System.out.println(" Element not found");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array Element: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter element index "+i+"=");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter Searching eliment: ");
		int ele = sc.nextInt();

		try {
			
			SearchIndex(arr, ele);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Plese enter valid value");

		}

	}

}
