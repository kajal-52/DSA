package com.ztm.algorithms.searching;

/**
 * O(n) complexity
 * not the fastest way to search
 */
public class LinearSearch {
    public static int getTheElementIndex(int[] array, int element){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
               return i;
            }
        }
        return -1;
    }

}
