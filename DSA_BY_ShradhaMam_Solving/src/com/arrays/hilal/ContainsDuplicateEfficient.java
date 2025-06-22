package com.arrays.hilal;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicateEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array size
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Check for duplicates using HashSet
        boolean hasDuplicate = false;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;
            }
            set.add(num);
        }

        // Output result
        if (hasDuplicate) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain any duplicates.");
        }

        sc.close();
    }
}