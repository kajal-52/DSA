package com.ztm.dsa.Arrays;
/*
Given an integer array and integer m
count the sum of required frequency of each element to make it equal to m, if frequency equal or greater than m skip
int[] arr = {2, 2, 4,5,5,5,5,5,8,8,9}
int m = 4
frequency required by each element
=> 2->2
   4->3
   5->skip
   8->2
   9->3
sum= 2+3+2+3 =>10
 */
public class FrequencyInArray {
    public int getFrequencySumInArray(int[] arr, int m){
        int count = 1;
        int result = 0;
        int previous = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i]==previous){
                count+=1;
            }
            else {
                previous=arr[i];
                if (count<m){
                    result+=m-count;
                }
                count=1;
            }
            if (i==arr.length-1){
                result+=m-count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FrequencyInArray array= new FrequencyInArray();
        int[] arr = {2, 2, 4,5,5,5,5,5,8,8,9,9};
        int m = 4;
        int res = array.getFrequencySumInArray(arr,m);
        System.out.println(res);
    }
    /*
        Big O calculations
    n-1 -->
    -->O(n)
     */
}
