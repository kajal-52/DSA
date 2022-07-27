package com.ztm.data.structures.arrays;

import java.util.Arrays;
import java.util.Iterator;
//Static Array
public class StaticArray {

    public static void main(String[] args) {
        Character[] arr = {'a','b','c','d'};
        //adding new element to static array
        Character[] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = 'j';
        Iterator iter = Arrays.stream(newArr).iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
