package com.ztm.dsa.Arrays;

import java.util.Arrays;
import java.util.List;

/*
How do you find the one missing number in a given integer array of 1 to n?
int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
output = 18
 */
public class MissingNumberInArrayOptimized {
    public static int findMissing(int[] arr, int n){
        //Optimized force approach got through each element
        int sum = (n)*(1+n)/2;
        int sum1 = 0;
        for(int j = 0; j< arr.length;j++){
            sum1+=arr[j];
        }
        return sum-sum1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
        int n = 20;
        int miss=findMissing(arr,n);
        System.out.println(miss);
    }

}
