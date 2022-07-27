package com.ztm.data.structures.arrays;

public class ReverseAString {
    //Brute force approach
    /*
    This approach uses split to get string array then solves the problem
     */
    public static String getReversedString(String inputString){
        String out = "";
        String[] splitString= inputString.split(" ");
        for (int i = splitString.length-1;i>=0;i--) {
            String[] newString = splitString[i].split("");
            for (int j = newString.length-1;j>=0;j--){
                out+=newString[j];
            }
            out=out+" ";
        }
        return out;
    }

    public static void main(String[] args) {
        String input = "my name is kajal";
        System.out.println(getReversedString(input));
    }
}
