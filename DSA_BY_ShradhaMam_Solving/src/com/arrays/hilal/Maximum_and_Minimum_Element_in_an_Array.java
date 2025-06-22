package com.arrays.hilal;

import java.util.Scanner;

public class Maximum_and_Minimum_Element_in_an_Array {

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
			
		int min =0,max =0;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]< min) {
					min = arr[i];
				}
				if(arr[i]> max) {
					max = arr[i];
				}
			}
		}
		
		System.out.println("Max Is: "+max);
		System.out.println("Max Is: "+min);

	}

}
