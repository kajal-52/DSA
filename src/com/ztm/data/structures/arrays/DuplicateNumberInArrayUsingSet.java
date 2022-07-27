package com.ztm.data.structures.arrays;

import java.util.HashSet;
import java.util.Set;
/*
How do you find the duplicate number on a given integer array?
int arr[]={1,3,4,5,3,6,5,78}
set = (3,5)
 */
public class DuplicateNumberInArrayUsingSet {
    public static Set<Integer> findDuplicate(int[] arr){
        Set<Integer> set =new HashSet<>();
        Set<Integer> resultSet =new HashSet<>();
        for (int a:arr) {
            if (!set.contains(a)){
                set.add(a);
            }
            else
                 resultSet.add(a);
        }
        System.out.println(resultSet);
        return resultSet;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4,3,67,3,5,67};
        findDuplicate(arr);
    }
}
