package com.ztm.gfg;

public class ArrayGame {
    public static int minOps(int n, int[] arr,int[] brr){
        int count=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[0]==brr[0]){
                arr[i]=-1;
                brr[i]=-1;
                count+=1;
            }
            else {
                arr[n-1]=arr[0];
                arr[i]=arr[i+1];
                count+=1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b ={2,1,3};
        int min =minOps(3,a,b);
        System.out.println(min);
    }
}
