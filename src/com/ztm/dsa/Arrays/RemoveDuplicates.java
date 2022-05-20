package com.ztm.dsa.Arrays;

import java.util.Arrays;

/*
How are duplicates removed from a given array in Java?
String arr[] = {"i","no","p","up","no","i"}
String resultingArr[] = {"i","no","p","up"}
 */
public class RemoveDuplicates {
    public static String[] removeDuplicatesFromArray(String[] arr){
        Arrays.sort(arr);
        String previous = arr[0];
        String[] resultingArr=new String[arr.length];
        resultingArr[0]=previous;
        for (int i = 1;i<arr.length;i++){
            if(arr[i]!=previous){
                resultingArr[i]=arr[i];
            }
            previous=arr[i];
        }
        for (int j = 0;j<resultingArr.length;j++){
            System.out.println(resultingArr[j]);
        }

        return resultingArr;
    }

    public static void main(String[] args) {
        String arr[] = {"i","no","p","up","no","i"};
        removeDuplicatesFromArray(arr);
    }

}
