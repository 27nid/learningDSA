package com.dsa.demo;

import java.util.Arrays;

public class ArrayWavePattern {
    
    static void sortInWaveForm(int[] arr){

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap elements at i and i+1
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        
        sortInWaveForm(arr);

        System.out.println("Array in wave form: " + Arrays.toString(arr));
    }
}
