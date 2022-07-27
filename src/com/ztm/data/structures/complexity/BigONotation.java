package com.ztm.data.structures.complexity;

import java.util.Date;

public class BigONotation {
    public static void main(String[] args) {
        String[] array = {"dory","bruce","nemo","marlin"};
        //
        findNemo(array); //(O(n)) -->Linear time
//        getFirstBox(array);//O(1) -->Constant Time
    }
    public static void findNemo(String[] array){
        Date date = new Date();
        long t0 = date.getTime();
        for (String a: array) {
            if (a.equals("nemo")){
                System.out.println("Found NEMO");
                break;
            }
            else {
                System.out.println("Looks like she is not here");
            }
        }
        long t1 = date.getTime();
        System.out.println("Call to find Nemo took: "+(t1-t0)+" milliseconds");
    }
    public static void getFirstBox(String[] array){
        System.out.println(array[0]);
    }
}
