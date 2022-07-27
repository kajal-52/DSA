package com.ztm.data.structures.queue;

public class Runner {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enqueue("orange");
        queue.enqueue("banana");
        queue.enqueue("mango");
        System.out.println(queue.peek().data);
        queue.dequeue();
        System.out.println(queue.peek().data);
    }
}
