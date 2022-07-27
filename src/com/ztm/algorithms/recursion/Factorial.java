package com.ztm.algorithms.recursion;

public class Factorial {
    public int findFactorialByRecursive(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorialByRecursive(n-1);
    }
    public int findFactorialByIterative(int n){
        int res = 1;
        while (n>0){
            res = res*n;
            n=n-1;
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial factorial= new Factorial();
        int result1 = factorial.findFactorialByRecursive(8);
        System.out.println(result1);
        int result2= factorial.findFactorialByIterative(8);
        System.out.println(result2);
    }
}
