package com.ztm.dsa.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr_name = {
                new int[] {10, 20, 30 ,40},
                new int[] {50, 60, 70, 80, 90, 100},
                new int[] {110, 120}
        };
        System.out.println(arr_name.length);
        for (int i = 0; i< arr_name.length;i++){
            for (int j = 0; j< arr_name[i].length;j++){
                System.out.println(arr_name[i][j]);
            }
        }

    }
}

