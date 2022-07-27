package com.ztm.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticProgression {
    public int checkIfNumberPartOfSeries(int a, int d, int c){
        if(d==0){
            return (a==c?1:0);
        }
        System.out.println((c-a));
        System.out.println((c-a)/d);
        return ((c-a)%d==0&&(c-a)/d>=0?1:0);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(isr);
        int a = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        ArithmeticProgression ap =new ArithmeticProgression();
        int out =ap.checkIfNumberPartOfSeries(4,4,-12);
        System.out.println(out);
    }
}
