package com.ztm.algorithms.sorting;

import java.util.Arrays;

public class InBuiltSorting {
    public static void main(String[] args) {
        int[] arr = {101, 656, 59, 745, 176};
        char[] chars = {'a','t', 'e', 'z', 'w'};
        Arrays.sort(arr);
        Arrays.sort(chars);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(chars[i]+" ");
        }
    }
}
