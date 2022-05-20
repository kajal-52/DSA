package com.ztm.dsa.Arrays;
/*
Creating array from scratch
 */
public class CustomArray {
    private int length;
    Object[] data;

    public CustomArray() {
        this.length = 0;
        this.data = new Object[100];
    }

    public Object getData(int index) {
        return data[index];
    }
    public int setData(String item) {
        this.data[this.length]=item;
        this.length++;
        return this.length;
    }
//    public Object popData(){
//        Object lastItem= this.data[this.length-1];
//        this.length--;
//        return lastItem;
//    }

    public static void main(String[] args) {
        String[] arr = {};
        CustomArray newArray = new CustomArray();
        newArray.setData("Rest");
        newArray.setData("Web");
        System.out.println(newArray.getData(0));
    }

}

