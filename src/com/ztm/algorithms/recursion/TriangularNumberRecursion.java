package com.ztm.algorithms.recursion;

public class TriangularNumberRecursion {
    public static int getNthTriangularNumber(int n){
        if (n==1){
            return 1;
        }
        return n+getNthTriangularNumber(n-1);
    }

    public static void main(String[] args) {
        int nthTriangularNumber =getNthTriangularNumber(4);
        System.out.println(nthTriangularNumber);
    }
}
