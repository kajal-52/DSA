package com.ztm.data.structures.exercise;
/*
   Given a collection of integers and task is to get pair-of integers with the given sum.
   arr = Array = [1, 2, 3, 9], Sum = 8
   return false
   arr = Array = [1, 2, 4, 4], Sum = 8
   return true
 */
public class GoogleExercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9};
        int sum = 8;
        boolean found = getPairWithTargetSum(array, sum);
        System.out.println("Is pair part of array: "+found);
    }
//    Brute force approach
    public static boolean getPairWithTargetSum(int[] arr, int sum){
        boolean hasPair = false;
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            int s = arr[low]+arr[high];
            if (s==sum){
                hasPair=true;
                break;
            }
            else if (s < sum)
                low = low+1;
            else
                high = high -1;
        }
        return hasPair;
    }
        /*
    Big O calculations
    n -->
    -->O(nlogn)
     */

}
