package com.ztm.data.structures.exercise;

import java.util.Hashtable;
/*
Given 2 arrays find if any common element return true else return false.
arr1 = ['a', 'b', 'c', 'd', 'e']
arr2 = ['n','m','x']
returns false

arr1 = ['a', 'b', 'c', 'd', 'e']
arr2 = ['n','m','a']
returns true
 */
public class Exercise4optimized {
    public static boolean getCommonElementInArrays(int[] array1, int[] array2){
        boolean foundCommon = false;
        Hashtable<Integer, Boolean> integerHashtable = new Hashtable<>();
        for (int a:array1) {
            if(!integerHashtable.containsKey(a)){
                integerHashtable.put(a,true);
            }
        }
        for (int a2:array2) {
            if(integerHashtable.containsKey(a2)){
                foundCommon = true;
            }
        }
        return foundCommon;
    }

    public static void main(String[] args) {
        int[] array1 = {-5, 2, 4, -1};
        int[] array2 = {7, 3, 8, 91};
        boolean found = getCommonElementInArrays(array1,array2);
        System.out.println("Is element common in arrays: "+ found);
    }
            /*
    Big O calculations
    n+n --> 2n
    -->O(n)
     */
}
