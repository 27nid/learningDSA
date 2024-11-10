package com.dsa.demo;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }

        // Sort strings using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results of a + b and b + a
                return (b + a).compareTo(a + b);
            }
        });

        // Edge case: If the highest number is "0", the result should be "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Join the sorted strings to form the largest number
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("Largest Number: " + largestNumber(nums));  // Output: "9534330"
    }
}
