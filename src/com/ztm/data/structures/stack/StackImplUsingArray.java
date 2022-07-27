package com.ztm.data.structures.stack;

public class StackImplUsingArray {
    String[] stackArray ;
    int i =0;
    public StackImplUsingArray(){
        this.stackArray= new String[3];
    }
    public void push(String element){
        stackArray[i] = element;
        i++;
    }
    public void printStack(){
        for (int j = 0; j < stackArray.length; j++) {
            System.out.println(stackArray[j]);
        }
    }
    public void pop(){
    }
    public String peek(){
        System.out.println(this.stackArray[stackArray.length-1]);
        return this.stackArray[this.stackArray.length-1];
    }

}
