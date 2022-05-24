//package com.ztm.dsa.Arrays;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class mergeSortedArray {
//    public static void mergeSortedArrayUsingBruteForce(int[] arr1, int[] arr2) {
//        List<Integer> outList = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while (i < arr1.length) {
//            while (j < arr2.length) {
//                if (arr1[i] <= arr2[j]) {
//                    outList.add(arr1[i]);
//                    i++;
//                }
//                else {
//                    outList.add(arr2[j]);
//                    j++;
//                    if(j== arr2.length)
//                        break;
//                }
//            }
//        }
//        System.out.println(outList);
//    }
//
//    public static void main(String[] args) {
//        int[] arr1={2,4, 5,9};
//        int[] arr2={1, 6, 8};
//        mergeSortedArrayUsingBruteForce(arr1,arr2);
//    }
//}
