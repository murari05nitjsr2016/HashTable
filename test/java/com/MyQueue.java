package com;

import com.datastructure.INode;
import com.datastructure.MyLinkedList;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
/*This method add the node to tail because queue
    followed the FIFO
 */
    public void push(INode myNode) {
        myLinkedList.append(myNode);
    }
//This method prints the all node present in queue.
    public void printStack() {
        myLinkedList.printMyNodes();
    }

//This method returns the first added node of queue.
    public INode peak() {
        return myLinkedList.head;
    }
}
