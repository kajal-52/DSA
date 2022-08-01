package com.ztm.hackerearth;

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr){
                //Your code goes here
                int n=arr.length;
                int sumR=0;
                int sumL=0;
                for (int i = 1; i < n; i++) {
                    sumR+=arr[i];
        }
                for (int j = 1; j <n ; j++) {
//                    System.out.println(sumL +"->"+sumR);
                    if(sumL!=sumR){
                        sumL += arr[j - 1];
                        sumR -= arr[j];
                    }else
                        return j-1;

                 }
                return 0;
            }

    public static void main(String[] args) {
        int[] arr= {6,3,2,6,5,6};
        int res=findEquilibriumIndex(arr);
        System.out.println(res);
    }
}
