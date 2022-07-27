package com.ztm.data.structures.linkedlist;

public class CustomDoublyLinkedList {
    NodeDouble head;
    int length = 1;

    public void append(String data){
        NodeDouble nodeDouble = new NodeDouble();
        nodeDouble.data = data;
        nodeDouble.prev = null;
        nodeDouble.next = null;
        if (head==null){
            head=nodeDouble;
        }
        else {
            NodeDouble node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next= nodeDouble;
            nodeDouble.prev = node;
        }
        this.length++;
    }
    public void show(){
        NodeDouble node = head;
        while(node.next!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.print(node.data);
    }
    public void prepend(String data){
        NodeDouble nodeDouble = new NodeDouble();
        nodeDouble.data = data;
        nodeDouble.prev = null;
        nodeDouble.next = this.head;
        head.prev = nodeDouble;
        this.head = nodeDouble;
    }
    public void insert(String data, int index){
        NodeDouble nodeDb = new NodeDouble();
        nodeDb.data = data;
        nodeDb.next = null;
        nodeDb.prev = null;
        NodeDouble n = head;
        if (index==0){
            prepend(data);
        }
        NodeDouble leader = traverseToIndex(index-1);
        NodeDouble follower = leader.next;
        leader.next = nodeDb;
        nodeDb.next = follower;
        nodeDb.prev = leader;
    }
    public void remove(){

    }
    public NodeDouble traverseToIndex(int index){
        int counter = 0;
        NodeDouble currNode = head;
        while (counter!=index){
            currNode = currNode.next;
            counter+=1;
        }
        return currNode;
    }

}
