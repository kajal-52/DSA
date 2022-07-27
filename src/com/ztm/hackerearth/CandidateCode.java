package com.ztm.hackerearth;
/*
C1 = 1 C2 = 10
Total = 4

1*4*4+10*0*0 => 16
1*3*3+10*1*1 => 19
1*2*2+10*2*2 => 44
1*1*1+10*3*3 => 92
1*0*0+10*4*4 => 160
 */

import java.util.Scanner;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of testcases: ");
      int t = sc.nextInt();
      System.out.println("Enter total : ");
      int m = sc.nextInt();
      int c1 =  sc.nextInt();
      int c2  = sc.nextInt();
      for(int k=0;k<t;k++){
         int output = getMinCost(c1, c2, m);
         System.out.print(output);
      } 

   }
   public static int getMinCost(int c1, int c2, int m){
      int minCost = cost(c1, c2, m, 0);
      for(int j =1;j<=m;j++){
         int sum1 = cost(c1, c2, m, j);
         if(sum1<minCost){
            minCost = sum1;
         }
      }
      return minCost;
   }
   public static int cost(int c1, int c2, int m, int i){
      int sum = c1*i*i+c2*(m-i)*(m-i);
      return sum;
   }

}
