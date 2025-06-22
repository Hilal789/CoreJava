package com.arrays.hilal;

import java.util.Scanner;

public class Maximum_Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array size
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("===============");

        // Kadane's Algorithm with subarray tracking
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax + arr[i]) {
                currentMax = arr[i];
                tempStart = i;
            } else {
                currentMax += arr[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                start = tempStart;
                end = i;
            }
        }

        // Print the results
        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}