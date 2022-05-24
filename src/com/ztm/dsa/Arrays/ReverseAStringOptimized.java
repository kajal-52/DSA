package com.ztm.dsa.Arrays;

public class ReverseAStringOptimized {
    public static String getReversedString(String inputString){
        String out = "";
        for (int i = inputString.length()-1;i>=0;i--) {
            out+=inputString.charAt(i);
        }
        return out;
    }


    public static void main(String[] args) {
        String input = "my name is kajal";
        System.out.println(getReversedString(input));
    }

}
