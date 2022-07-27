package com.ztm.data.structures.exercise;

import java.util.Hashtable;

/*
   Given a collection of integers and task is to get pair-of integers with the given sum.
   arr = Array = [1, 2, 3, 9], Sum = 8
   return false
   arr = Array = [1, 2, 4, 4], Sum = 8
   return true
 */
public class TargetSumInArray {
    //Optimized sol using hashtable
    public static boolean getPairsWithTargetSum(int[] array, int sum){
        boolean foundPair = false;
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<>();
        for (int a:array
             ) {
            integerHashtable.put(a,sum-a);
            if(integerHashtable.containsKey(integerHashtable.get(a))){
                foundPair = true;
            }
        }
        return foundPair;
    }

    public static void main(String[] args) {
        int[] array = {-5, 2, 4, -1};
        int sum = -1;
        boolean found = getPairsWithTargetSum(array,sum);
        System.out.println(found);
    }
            /*
    Big O calculations
    n
    -->O(n)
     */

}
