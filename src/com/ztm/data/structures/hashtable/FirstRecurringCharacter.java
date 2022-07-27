package com.ztm.data.structures.hashtable;

import java.util.Hashtable;
/**
 * Given an array get the first element that is repeated
 * int intArr[]= {2, 1, 5, 3, 2, 6,5}
 * res = 2
 */

public class FirstRecurringCharacter {
    public int getFirstRecurringChar(int[] arr){
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for(int j = 0 ; j < arr.length; j++ ){
            if(!hashtable.containsKey(arr[j])){
                hashtable.put(arr[j], 1);

            }
            else
                return arr[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstRecurringCharacter firstRecurringCharacter = new FirstRecurringCharacter();
        int intArr[]= {2, 1, 5, 3, 2, 6,5};
        int val =firstRecurringCharacter.getFirstRecurringChar(intArr);
        System.out.print(val);
    }
        /*
    Big O calculations
    n -->
    -->O(n)
     */

}
