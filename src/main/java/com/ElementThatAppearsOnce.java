package com;

import java.util.*;
public class ElementThatAppearsOnce {

    public static int findUnique(int[] arr) {
        int ones = 0, twos = 0;

        for (int num : arr) {
            // Update 'twos' first because we don't want to overwrite ones' result
            twos |= ones & num;
            // Update 'ones' with the current number
            ones = ones ^ num;
            // If an element appears three times, remove it from both 'ones' and 'twos'
            int threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }

    static List<Integer> multipleUniqueElements(int[] arr){

            Map<Integer,Integer> hashMap = new HashMap<>();

            for(int num :arr){
                hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
            }

            List<Integer> result = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
                if(entry.getValue() == 1) result.add(entry.getKey());
            }
            return result;
        }



        static int MacNumberInanArray(int[] arr){

            Map<Integer,Integer> hashMap = new LinkedHashMap<>();

            int maxFreq =0;
            int maxNum = arr[0];
            for(int num :arr){
                hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
            }

            for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
                if(entry.getValue()>=maxFreq){
                    maxNum=entry.getKey();
                    maxFreq=entry.getKey();
                }
            }
            return maxNum;
        }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 9, 3, 2, 3, 3, 4 };

        List<Integer> res = multipleUniqueElements(arr);
        for(int num : res) System.out.println(num);

        System.out.println("max freq number is "+MacNumberInanArray(arr));
        System.out.println("The element that appears once is: " + findUnique(arr));
    }
}
