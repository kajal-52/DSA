package com.ztm.data.structures.stack;

public class Runner {
    public static void main(String[] args) {
//        StackImpl stack = new StackImpl();
//        stack.push("google");
//        stack.push("Yahoo");
//        stack.push("Hotmail");
//        stack.peek();
//        stack.pop();
//        stack.pop();
//        stack.pop();
        StackImplUsingArray stackArray = new StackImplUsingArray();
        stackArray.push("Meta");
        stackArray.push("Amazon");
        stackArray.push("Oracle");
//        stackArray.printStack();class Node
//{
//    int data;
//    Node left, right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//};
        stackArray.peek();
    }
}
