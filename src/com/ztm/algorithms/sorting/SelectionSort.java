package com.ztm.algorithms.sorting;

/**
 * Big O complexity is O(n^2)
 * space complexity is O(1) as no additional data structure for the storage
 */
public class SelectionSort {
    public void sortIt(int[] arr){

        for (int i = 0; i <arr.length ; i++){
            int min_index = i;
//            System.out.print(min_index+" ");
            for (int j = i+1; j <arr.length ; j++) {
                //swap the numbers
                if(arr[min_index]>arr[j]){
                    min_index=j;
//                    System.out.print(min_index+" ");
                }
            }
            //swap the elements
            int temp = arr[min_index];
//            System.out.println("temp: " +temp);
            arr[min_index] = arr[i];
            arr[i] =temp;
        }

    }

    public static void main(String[] args) {
        int[] ints={3, 45, 234, 2, 90,-3, -5};
        SelectionSort sort= new SelectionSort();
        sort.sortIt(ints);
        System.out.print("Array after sorting: ");
        for (int k = 0; k < ints.length; k++) {
            System.out.print(ints[k]+" ");
        }
    }
}
