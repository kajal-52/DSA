package com.ztm.algorithms.recursion;

/**
 * Recursive sol have exponential complexity which is 2^n
 * which is not very good
 *
 */

public class Fibonacci {
    public int fibonacciByRecursive(int n){
        int res[]= new int[n];
        if(n<2){
            return n;
        }
        return fibonacciByRecursive(n-1)+fibonacciByRecursive(n-2);
    }
    public void fibonacciByIterative(int n){
        int res[]= new int[n];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i]=res[i-1]+res[i-2];
        }
        for (int j = 0; j < n; j++) {
            System.out.println(res[j]);
        }
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int n = 25;
//        fib.fibonacciByIterative(10);
        for (int i = 0; i <n ; i++) {
            System.out.println(fib.fibonacciByRecursive(i));
        }
    }
}
