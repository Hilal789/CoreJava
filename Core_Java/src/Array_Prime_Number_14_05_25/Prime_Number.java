package Array_Prime_Number_14_05_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime_Number {

	public static boolean isPrime(int n) {
		int count = 0;
		
		if(n==1) {
			return true;
		}
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==1) {
			return true;
		}else {
			return false;
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
			System.out.println("Prime Number: ");
			for(int i=0; i<arr.length; i++) {
				if(isPrime(arr[i])) {
					System.out.print(arr[i]);
				}
				
			}
			
		} catch (NegativeArraySizeException e) {
			System.err.println("Error...Negative size");
		} catch (IllegalArgumentException e) {
			System.err.println("Error...Array size is 0");
		} catch (NullPointerException e) {
			System.out.println("Error...Array object is null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error...Array size is 0");
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input ");
		}
	}

}
