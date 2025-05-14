package Array_ReadingAndPrinting_14_05_25;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadAndPrintArray {

	public static void usingForLoop(int arr[]) {

		System.out.println("===========Using For Loop============");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void usingForEachLoop(int arr[]) {
		System.out.println("===========Using For Each============");
		for (int store : arr) {
			System.out.print(store + " ");
		}
		System.out.println();
	}

	public static void usingArraysToString(int arr[]) {
		System.out.println("===========Using Arrays.toString()============");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array size: ");
		int n = sc.nextInt();

		try {
			int arr[] = new int[n];

			if (arr.length == 0)
				throw new IllegalArgumentException();

			System.out.println("Enter element to Store in array :");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter element at index " + i + " : ");
				arr[i] = sc.nextInt();
			}
			usingForLoop(arr);
			usingForEachLoop(arr);

			usingArraysToString(arr);

		} catch (NegativeArraySizeException e) {
			System.out.println("Error...Negative size");
		} catch (InputMismatchException e) {
			System.out.println("Input values must be Integer");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invaild index to access");
		} catch (IllegalArgumentException e) {
			System.out.println("Array size can't be zero..");
		} catch (NullPointerException e) {
			System.out.println("Array can't be null");

		}

	}

}
