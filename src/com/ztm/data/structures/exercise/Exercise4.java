package com.ztm.data.structures.exercise;
/*
Given 2 arrays find if any common element return true else return false.
arr1 = ['a', 'b', 'c', 'd', 'e']
arr2 = ['n','m','x']
returns false

arr1 = ['a', 'b', 'c', 'd', 'e']
arr2 = ['n','m','a']
returns true
 */
public class Exercise4 {
    //Brute force approach
    public static boolean checkIfCommonElement(String[] arr1, String[] arr2){
        boolean hasCommon = false;
        for(int i =0; i<arr1.length; i++){ //O(n)
            for(int j =0; j<arr2.length; j++){ //O(m)
                if(arr1[i]==arr2[j]){
                    hasCommon = true;
                }
            }
        }
        return hasCommon;
    }

    public static void main(String[] args) {
        String[] array1  = {"a", "b", "c", "d", "e"};
        String[] array2  = {"x", "m", "c"};
        boolean foundCommon = checkIfCommonElement(array1,array2);
        System.out.println(foundCommon);
    }

        /*
    Big O calculations
    n*m
    -->O(n*m)
     */

}
