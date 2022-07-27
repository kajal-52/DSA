package com.ztm.data.structures.linkedlist;

public class Runner {
    public static void main(String[] args) {
        CustomSinglyLinkedList linkedList= new CustomSinglyLinkedList();
        linkedList.append("apple");
        linkedList.append("ball");
        linkedList.append("cat");
        linkedList.prepend("dog");
//        linkedList.show();
        linkedList.insert(4, "elephant");
        linkedList.remove(2);
        linkedList.printList();
//        linkedList.reverse();
        CustomDoublyLinkedList linkedList1 = new CustomDoublyLinkedList();
        linkedList1.append("Zebra");
        linkedList1.append("X-mas");
        linkedList1.prepend("Apple");
        linkedList1.insert("ball", 1);
        linkedList1.show();
    }
}

