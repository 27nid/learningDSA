package com.dsa.demo;

public class SumOfMaxAndMin {
    
    public static int sumOfMaxAndMin(int[] arr) {
        // Edge case: if the array is empty
        if (arr.length == 0) {
            return 0;  // Or handle it as per your needs
        }

        // Initialize min and max to the first element of the array
        int minElement = arr[0];
        int maxElement = arr[0];

        // Traverse the array to find the min and max elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Return the sum of the minimum and maximum elements
        return minElement + maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4};
        int result = sumOfMaxAndMin(arr);
        System.out.println("Sum of max and min: " + result);
    }
}
