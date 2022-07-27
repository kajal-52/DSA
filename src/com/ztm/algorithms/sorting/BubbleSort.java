package com.ztm.algorithms.sorting;

/**
 * Big-O complexity is O(n*n)
 * Not the efficient sorting algorithm
 * we aren't storing into any other data structure so space complexity is O(1)
 */
public class BubbleSort {
    public void sortIt(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                //swap the numbers
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints={3, 45, 234, 2, 90,-3, -5};
        BubbleSort sort =new BubbleSort();
        sort.sortIt(ints);
        for (int k = 0; k < ints.length; k++) {
            System.out.print(ints[k]+" ");
        }
    }
}

