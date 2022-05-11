package com.ztm.dsa.exercise;

public class Exercise1 {
    public int funChallenge(String[] input){
        int a = 10; //O(1)
        a = a + 50; //O(1)
        for (int j = 0; j < input.length; j++){ //O(n)
            anotherFunction(); //O(n)
            Boolean stranger =  true; //O(n)
            a++; //O(n)
        }
        return a; //O(1)
    }


    public void anotherFunction(){}

    /*
    Big O calculations
    1+1+1+n+n+n+n --> 3+4n
    (3+4n)
    -->O(n)
     */

}
