package com.ztm.dsa.Arrays;

import java.util.*;
import java.util.ArrayList;

/**
 * <h1>How do you find the duplicate number on a given integer array?</h1>
 * int arr[]={1,3,4,5,3,6,5,78}
 * int result[] = {3,5}
 *  @author Kajal Tiwari
 *  @version 1.0.0
 *  @since 5/27/2022
 */


public class DuplicateNumberInArray {
    public static List<Integer> findDuplicate(int[] arr){
        Arrays.sort(arr);
        List<Integer> list =new ArrayList<>(arr.length);
        int previous = arr[0];
        for (int i=1;i< arr.length; i++) {
            if(arr[i]==previous){
                list.add(arr[i]);
            }
            previous = arr[i];
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4,3,67,3,5,67};
        findDuplicate(arr);
    }
}
