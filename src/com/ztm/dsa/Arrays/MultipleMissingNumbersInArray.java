package com.ztm.dsa.Arrays;

import java.util.BitSet;

/*
How do you find the multiple missing number in a given integer array of 1 to n?
int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
output = 18
 */
public class MultipleMissingNumbersInArray {
    public static int missingValues(int[] arr, int n){
        int numOfMissingVal = n-arr.length;
        BitSet bitSet= new BitSet(n);
        for (int num :arr) {
            bitSet.set(num-1);
        }
        int lastMissingIndex = 0;
        for (int i= 0;i<numOfMissingVal;i++){
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
        }
      return lastMissingIndex+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
        int miss = missingValues(arr,20);
        System.out.println(miss);
    }
}
