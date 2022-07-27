package com.ztm.data.structures.linkedlist;

public class ReverseALinkedList {
    Node head;
    public Node reverse(){
        if(head.next==null){
            return head;
        }
        Node first = head;
        Node second = first.next;
        while(second!=null){
            Node temp  = second.next;
            first = second;
            second = temp;
        }
        head.next = null;
        first=head;
        return first;
    }
}
