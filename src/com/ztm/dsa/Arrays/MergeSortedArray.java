package com.ztm.dsa.Arrays;

import java.util.Arrays;
/*
Merge two sorted arrays into one
int[] arr1={2,4, 5,9};
int[] arr2={1, 6, 8};
Arrays.sort complexity => nlogn
 */
public class MergeSortedArray {
    public static int[] mergeSortedArrayUsingBruteForce(int[] arr1, int[] arr2) {
        if (arr1.length==0){
            return arr2;
        }
        if (arr2.length==0) {
            return arr1;
        }
        int[] outArr = new int[7];
        for (int i = 0; i< arr1.length;i++ ){
            outArr[i]=arr1[i];
        }
        for (int j = 0; j< arr2.length;j++ ){
            outArr[arr1.length+j]=arr2[j];
        }
        Arrays.sort(outArr);
        return outArr;
    }

    public static void main(String[] args) {
        int[] arr1={2,5,8,9};
        int[] arr2={};
        int[] array = mergeSortedArrayUsingBruteForce(arr1,arr2);
        for (int k = 0;k< array.length;k++ ){
            System.out.println(array[k]);
        }
    }
    /*
           Big O calculations
    n+n+nlogn -->
    -->O(nlogn)
     */
}
