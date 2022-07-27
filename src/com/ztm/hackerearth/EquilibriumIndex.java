package com.ztm.hackerearth;

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr){
                //Your code goes here
                int n=arr.length;
                int sum1=0;
                int sum2=arr[n-1];
                int i =0;
                int j=n-1;
                while (i!=j){
                    if(sum1<sum2){
                        sum1+=arr[i];
                        i+=1;
                    }else if(sum1>sum2){
                        sum2+=arr[j-1];
                        j-=1;
                    }else {
                        return i;
                    }
                }
                return 0;
            }

    public static void main(String[] args) {
        int[] arr= {1,7,3,6,6,5,6};
        int res=findEquilibriumIndex(arr);
        System.out.println(res);
    }
}
