package com.dsa.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSum {


    static List<int[]> HashMapApproach(int[] arr,int target){
        HashSet<Integer> seen = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for(int num:arr){
            int comp = target-num;
            if(seen.contains(comp)){
                pairs.add(new int[]{comp,num});
            }
            seen.add(num);
        }
        return pairs;
    }

    static List<int[]> TwoPoinetrApprach(int arr[],int target){
        List<int[]> pairs = new ArrayList<>();

        int left =0,right=arr.length-1;
        Arrays.sort(arr);
        while(left<=right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                pairs.add(new int[]{left,right});
            left++;right--;
            } else if(sum > target) right--;
            else left++;
        }

        return pairs;
    }


    public static void main(String[] args) {
        

        int[] arr = new int[]{1,3,5,6,8,9};

        //List<int[]> pairs = HashMapApproach(arr, 11);

        List<int[]> pairs = TwoPoinetrApprach(arr,11);
        
        for (int[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
        
    }
}
