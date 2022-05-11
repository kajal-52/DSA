package com.ztm.dsa.complexity;

public class LogAllPairsOfArray {
    public static void logAllPairsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) { //O(n)
            for (int j = 0; j < array.length; j++) { //O(n)
                System.out.print(array[i]+" ");
                System.out.println(array[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] boxes = {1, 2, 3, 4, 5};
        logAllPairsOfArray(boxes);
    }

     /*
    Big O calculations
    n*n -->
    -->O(n^2)
     */

}
