package com.ztm.data.structures.hashtable;

/**
 * Given an array get the first element that is repeated
 * int intArr[]= {2, 1, 5, 3, 2, 6,5}
 * res = 2
 * Below sol fails for
 * int intArr[]= {2, 5, 5, 2, 3, 2, 6, 5}
 * res = 2, correct output = 5
 */
public class FirstRecurringCharacterBruteForce {
    public int getFirstRecurringCharUsingBruteForce(int[] arr){
        for(int j = 0 ; j < arr.length; j++ ){
            for(int i = j+1 ; i < arr.length; i++ ){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
                    }
        return -1;
    }

    public static void main(String[] args) {
        FirstRecurringCharacterBruteForce firstRecurringCharacter = new FirstRecurringCharacterBruteForce();
        int intArr[]= {2, 1, 5, 3, 2, 6,5};
        int val =firstRecurringCharacter.getFirstRecurringCharUsingBruteForce(intArr);
        System.out.print(val);
    }
        /*
    Big O calculations
    n*n -->
    -->O(n^2)
     */

}
