package com.ztm.data.structures.arrays;

import java.util.Scanner;

public class ThirdLargestInArray {


    public void sortInReverseOrder(int[] arr, int len){
        for(int j = 0; j<len ;j++){
            for(int k = j+1; k<len ;k++){
                if(arr[k]>arr[j]){
                    int temp =arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
//        for(int m = 0; m<len ;m++){
//            System.out.print(arr[m]+" ");
//        }
        System.out.print("Third Largest element in array: "+arr[len-3]);
    }

    public static void main(String[] args) {
        ThirdLargestInArray largest =new ThirdLargestInArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int len = sc.nextInt();
        System.out.print("Input array elements: ");
        int[] arr = new int[len];
        for(int i = 0; i<len ;i++){
            arr[i] = sc.nextInt();
        }
        largest.sortInReverseOrder(arr,len);
    }
}
