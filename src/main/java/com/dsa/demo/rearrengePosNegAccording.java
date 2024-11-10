package com.dsa.demo;

public class rearrengePosNegAccording {

    static void quickSortApproach(int[] arr , int n){

        int j=0, temp ;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }

    static void twoPointersApproach(int[] arr, int n){
        int left=0, right = n-1;
        while(left<=right){

            if(arr[left]>=0 && arr[right]>=0) right--;
            else if(arr[left]<=0 && arr[right]<=0) left--;
            else if(arr[left]>=0 && arr[right]<=0){
                int temp;
                temp = arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;right++;
            }
             else {
                right++;left--;
            }
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    

    public static void main(String[] args) {
        int[] arr = new int []{1,2,0,4,5,-6,7};
        int n = arr.length;

        twoPointersApproach(arr, n);
        printArray(arr,n);
    }
}
