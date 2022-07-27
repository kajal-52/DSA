package com.ztm.data.structures.stack;

import com.ztm.data.structures.linkedlist.Node;

public class StackImpl {
    Node top;
    Node bottom;
    int length;
    public StackImpl(){
        this.top=null;
        this.bottom = null;
        this.length=0;
    }
    public StackImpl push(String element){
        Node node = new Node(element);
//        node.data= element;
//        node.next= null;
        if(this.length==0){
            this.top = node;
            this.bottom= node;
        }
        else {
            Node holdNode = this.top;
            this.top= node;
            this.top.next = holdNode;

        }
        this.length++;
        return this;
    }
    public Node pop(){
        if (this.top==null){
            return null;
        }
        if ((this.top==this.bottom)){
            this.bottom=null;
        }
        Node holder = this.top;
        this.top= this.top.next;
        this.length--;
        System.out.println("Popped: "+holder.data);
        return holder;
    }
    public Node peek(){
        System.out.println("Peeked: "+ this.top.data);
        return this.top;
    }


}
