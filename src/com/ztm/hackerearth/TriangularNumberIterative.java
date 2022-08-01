package com.ztm.hackerearth;

public class TriangularNumberIterative {
    public int getNthTriangularNum(int n){
        int num = 0;
        if(n==1){
            return 1;
        }
        num = (n*(n+1))/2;
        return num;
    }

    public static void main(String[] args) {
        TriangularNumberIterative t = new TriangularNumberIterative();
        int nthTriangularNum =t.getNthTriangularNum(3);
        System.out.print("Nth Triangular Number is : "+nthTriangularNum);
    }
}
