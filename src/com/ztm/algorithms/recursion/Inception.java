package com.ztm.algorithms.recursion;

/**
 * throws StackOverflowError
 * Every recursion function requires a base case
 */
public class Inception {
    static void inceptionCall(){
        inceptionCall();
    }

    public static void main(String[] args) {
        inceptionCall();
    }
}
