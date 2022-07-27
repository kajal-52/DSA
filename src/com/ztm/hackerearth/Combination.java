package com.ztm.hackerearth;

import java.util.Scanner;

/**
 *  rounds=4 points=2
 *  maxLolo = floor(4/3)= 1
 *  B B L B
 *  B B B L
 *  B B B B
 */
public class Combination {
    public int winnerIsBebo(int round, int point){
        int result = 0;
        int maxLolo = (int) Math.floor(round/(point+1));
        System.out.println("Max times Lolo can win: "+ maxLolo); //1
        for (int i = 1; i <= maxLolo; i++) {
            int n= round-point; //2
            int r= 1;
            for (int j = 0; j < i; j++) {
                if(j==(i-1)){
                    r*=n;
                } else if (n>=(point+1)) {
                    r*=(point+1);
                    n-=point+1;
                }
            }
            System.out.println(r);
            result+=r;
        }
        return result+1;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int testCase = scanner.nextInt();
        Combination comb= new Combination();
        for (int j =0; j<testCase; j++){
            int res=comb.winnerIsBebo(scanner.nextInt(), scanner.nextInt());
            System.out.println("All possible ways: "+res);
        }
    }


}
