package com.ztm.dsa.Arrays;

public class CustomArray {
    private int length;
    String[] data;

    public CustomArray(int len, String[] arr) {
        this.length = 0;
        this.data = new String[100];
    }

    public String getData(int index) {
        return data[index];
    }
    public int setData(String item) {
        this.data[this.length]=item;
        this.length++;
        return this.length;
    }

    public static void main(String[] args) {
        String[] arr = {};
        CustomArray newArray = new CustomArray(0, arr);
        newArray.setData("Rest");
        System.out.println(newArray.getData(0));

    }

}

