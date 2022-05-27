package com.ztm.dsa.Arrays;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 int[] arr = {2,7,11,15}, target =9
 hashtable = {{2,7},{7,2}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class IndicesOfPairsReturningSum {
    public List<Integer> getIndicesOfPairs(int[] arr, int target){
        List<Integer> result= new ArrayList<>();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        if (target==0){
            return Arrays.asList();
        }
        if (arr.length==0){
            return Arrays.asList();
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i]<target){
                hashtable.put(arr[i],target-arr[i]);
            }
        }
        for (int j =0;j<arr.length;j++){
            if(hashtable.containsValue(arr[j])){
                result.add(j);
                System.out.println(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        IndicesOfPairsReturningSum indices = new IndicesOfPairsReturningSum();
        int[] arr = {2,7,11,15};
        int target =9;
        indices.getIndicesOfPairs(arr,target);
    }

}
