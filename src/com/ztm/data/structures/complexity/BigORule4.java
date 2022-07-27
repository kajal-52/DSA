package com.ztm.data.structures.complexity;

public class BigORule4 {
    public static void printAllNumbersThenAllPairSums(int[] numbers) {

        System.out.println("these are the numbers:");
        for (int num:numbers
             ) {
            System.out.println(num);

        }
        System.out.println("and these are their sums:");
        for (int num1:numbers
             ) {
            for (int num2:numbers
                 ) {
                System.out.println(num1+num2);

            }

        }
    }

    public static void main(String[] args) {
        int[] ints = {2, 4,5, 6, 30, 43};
        printAllNumbersThenAllPairSums(ints);

    }
     /*
    Big O calculations
    n+n^2 -->
    -->O(n^2)
     */
}
