package com.ztm.algorithms.sorting;

public class InsertionSort {
    public void sortIt(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int key =arr[i];
//            System.out.println("key = "+key);
            int j =i-1;
//            System.out.println("j="+j);
            while(j>=0 &&arr[j]>key){
                //swap the numbers
                    arr[j+1]=arr[j];
                    j=j-1;
                }
            arr[j+1]=key;
            }
    }

    public static void main(String[] args) {
        int[] ints={3, 45, 234, 2, 90,-3, -5};
        InsertionSort sort =new InsertionSort();
        sort.sortIt(ints);
        for (int k = 0; k < ints.length; k++) {
            System.out.print(ints[k]+" ");
        }
    }
}
