package com.ztm.dsa.complexity;

public class SpaceComplexity {
    public static void foo( int[] n){
        for (int i =0; i<=n.length;i++){ //O(1) for declaring i aand assigning 0 to that
            System.out.println("foooooooo!");
        }
    /*
     Big O space complexity calculations
    -->1
    -->O(1)
     */

    }
    public static String[] arrayofHiNTimes(int n){
        String[] array = {};
        for (int j = 0; j<n; j++){
            array[j] = "Hi"; //allocation n times
        }
        return array;
          /*
    Big O space complexity calculations
    -->n
    -->O(n)
     */
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9};
        foo(arr);
        arrayofHiNTimes(5);
    }

}
