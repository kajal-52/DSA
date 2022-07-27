package com.ztm.data.structures.arrays;

/**
 * <h1>Custom Array Implementation</h1>
 * @author Kajal Tiwari
 * @version 1.0.0
 * @since 5/27/2022
 */
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

