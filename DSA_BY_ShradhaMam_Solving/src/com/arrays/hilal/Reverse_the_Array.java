package com.arrays.hilal;

import java.util.Scanner;

public class Reverse_the_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + i + " Element: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("===============");
		
		System.out.println("Reverse Arrar: ");
		for(int i = arr.length -1; i>=0; i--) {
			System.out.print(arr[i]+", ");
			
		}
		
		
		
		
		

	}

}
