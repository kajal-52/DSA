package com.ztm.dsa.LinkedList;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        CustomLinkedList linkedList= new CustomLinkedList();
//        LinkedList linkedList = new LinkedList();
        linkedList.insert("apple");
        linkedList.insert("ball");
        linkedList.insert("cat");
        linkedList.prepend("dog");
        linkedList.show();
//        System.out.print(linkedList.getFirst());
    }
}
