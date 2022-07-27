package com.ztm.data.structures.arrays;
/*
How do you find the largest and smallest number in an unsorted integer array?
int arr[] ={17,-2,34,5,98,0}
max=98
min=-2
 */
public class FindSmallestAndLargest {
    public static void smallestAndLargestInArray(int integerArr[]){
        int min = integerArr[0];
        int max = integerArr[0];
        for (int i =0; i<integerArr.length;i++){
            if (integerArr[i]>max)
                max=integerArr[i];
            else if (integerArr[i]<min){
                min = integerArr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int intArr[] ={17,-2,34,5,98,0};
        smallestAndLargestInArray(intArr);
    }
}
