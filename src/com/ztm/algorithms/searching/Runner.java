package com.ztm.algorithms.searching;

import static com.ztm.algorithms.searching.BinarySearch.getIndex;
import static com.ztm.algorithms.searching.LinearSearch.getTheElementIndex;

public class Runner {
    public static void main(String[] args) {
        int[] arr= {-45,-2, 5, 9, 10,11, 65};
        int found = getTheElementIndex(arr,-23);
        if (found==-1){
            System.out.println("Element not part of array");
        }else
            System.out.println("Element found at: "+found);
        int binIndex= getIndex(arr,-45);
        if (binIndex==-1){
            System.out.println("Element not part of array");
        }else
            System.out.println("Element found at: "+binIndex);
    }
}
