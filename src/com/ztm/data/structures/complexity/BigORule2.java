package com.ztm.data.structures.complexity;

public class BigORule2 {
    public void printFirstItemThenFirstHalfThenSayHi100Times(int[] items) {
        System.out.println(items[0]); //O(1)
        double middleIndex = Math.floor(items.length / 2);
        int index = 0;

        while (index < middleIndex) { //O(n/2)
            System.out.println(items[index]);
            index++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Hi"); //O(100)
        }
    }
    /*
    Big O calculations
    1+n/2+100 --> 101+n/2
    RULE 2 remove constants
        -->O(n/2)
     */
}
