package com.ztm.data.structures.arrays;

import java.util.Arrays;
import java.util.List;

/*
How do you find the one missing number in a given integer array of 1 to n?
int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
output = 18
 */
public class MissingNumberInArray {
    public static int findMissing(List<Integer> arr, int n){
        //Brute force approach got through each element
        int missing =-1;
        for(int j=1;j<n;j++){
            if(!arr.contains(j)){
                missing = j;
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20);
        int n = 20;
        int miss=findMissing(arr,n);
        System.out.println(miss);
    }

}
