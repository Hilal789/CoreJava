package Array_Reverse_14_05_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray {

	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end/2) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+" ");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		try {
			int arr[] = new int[size];

			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter element index " + i);
				arr[i] = sc.nextInt();

			}
			reverseArray(arr);
		} catch (NegativeArraySizeException e) {
			System.err.println("Error...Negative size");
		} catch (IllegalArgumentException e) {
			System.err.println("Error...Array size is 0");
		} catch (NullPointerException e) {
			System.out.println("Error...Array object is null");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Error...Array size is 0");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter valid input ");
		}

	}
}
