package com.datastructure;

public class MyStack {

    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
//This method adds the node in stack at top.
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

//This method prints the all stack object
    public void printStack() {
        myLinkedList.printMyNodes();
    }
//This method returns the top element of stack.
    public INode peak() {
        return myLinkedList.head;
    }
// This method deletes the last node from stack
    public INode pop() {
        return myLinkedList.pop();

    }
}
