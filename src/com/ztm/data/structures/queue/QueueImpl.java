package com.ztm.data.structures.queue;

import com.ztm.data.structures.linkedlist.Node;

public class QueueImpl {
    Node first;
    Node last;
    int length;
    public QueueImpl(){
        this.first = null;
        this.last = null;
        this.length =0;
    }

    public Node peek(){
        return this.first;
    }
    public void enqueue(String data){
        Node node =new Node(data);
        if(this.length==0){
            this.first =node;
            this.last=node;
        }
        else {
            this.last.next = node;
            this.last = node;

        }
        this.length++;

    }
    public Node dequeue(){
        if(this.first==null){
            return null;
        }
        if ((this.first==this.last)){
            this.last=null;
        }
        Node oldnode = this.first;
        this.first=this.first.next;
        this.length--;
        return oldnode;
    }
}
