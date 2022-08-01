package com.ztm.hackerearth;

import java.util.ArrayList;
import java.util.List;

public class GiantNumber {
    public static void getGiantNum(int[] arr){
        int giant =-1;
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >0 ; i--) {
          if (giant<arr[i]) {
              giant = arr[i];
              list.add(giant);
          }
        }
        for (int j = list.size()-1; j >-1 ; j--) {
            System.out.println(list.get(j));
        }
    }

    public static void main(String[] args) {
        int[] array = {16,17,4,5,3,2};
        getGiantNum(array);
    }
}
