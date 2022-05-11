package com.ztm.dsa.complexity;

public class BigORule3 {
    public void compressBoxesTwice(String[] boxes,String[] boxes2){
        for (String box:boxes
             ) {
            System.out.println(box);//O(n)

        }
        for (String box:boxes2
        ) {
            System.out.println(box);//O(m)

        }
    }
        /*
    Big O calculations
    n+m -->
    -->O(n+m)
     */
}
