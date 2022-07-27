package com.ztm.data.structures.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class CustomSinglyLinkedList {
    Node head;

    public void append(String data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null){
            head= node;
        }else {
            Node n = head;
            while (n.next !=null){
                n = n.next;

            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data+" ");
    }
    public void prepend(String data){
        Node node = new Node();
        node.data = data;
        node.next = this.head;
        this.head = node;
    }
    public void insert(int index, String data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if (index==0){
            prepend(data);
        }
        traverseToIndex(index-1);
        Node nextNode = n.next;
        n.next = node;
        node.next = nextNode;
    }
    public void remove(int index){
        if (index==0){
            Node n = head;
            head.next = n;
        }else {
            Node currNode = traverseToIndex(index - 1);
            currNode.next = currNode.next.next;
        }
    }
    public Node traverseToIndex(int index){
        int counter = 0;
        Node currNode = head;
        while (counter!=index){
            currNode = currNode.next;
            counter+=1;
        }
        return currNode;
    }
    public List<String> printList(){
        List<String> list = new ArrayList<>();
        Node node = head;
        while (node.next!=null){
            list.add(node.data);
            node= node.next;
        }
        list.add(node.data);
        System.out.println(list);
        return list;
    }
//    public void reverse(){
//
//        if(head.next==null){
//            System.out.println(head);
//        }
//        Node first = head;
//        Node second = first.next;
//        while(second!=null){
//            Node temp  = second.next;
//            first = second;
//            second = temp;
//        }
//        head.next = null;
//        head=first;
//        printList();
//    }

}
