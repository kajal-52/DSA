package com.ztm.algorithms.recursion;

public class InceptionWithBase {
    static int counter =0;
    static void inceptionCall(){

        while (counter<3){
            System.out.println("Done");
            counter++;
            inceptionCall();
            break;
        }

    }

    public static void main(String[] args) {
        inceptionCall();
    }

}
