package com.ztm.algorithms.searching;

/**
 * for sorted arrays only
 * Divide and conquer approach
 * complexity is O(logn)
 */
public class BinarySearch {
    public static int getIndex(int[] array, int element){
        int l= 0;
        int r =array.length-1; //r=5
        for (int i = 0; i < array.length; i++) {
            int mid = (l+r)/2; //5/2 = 2
            if(element<array[mid]){
                r=mid;
            }else if(element>array[mid]){
                l=mid;
            }else
                return mid;
        }
        return -1;
    }


}
