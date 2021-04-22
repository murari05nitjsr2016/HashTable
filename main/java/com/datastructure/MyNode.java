package com.datastructure;

public class MyNode <K> implements INode<K>{
    private K key;
    private INode next;
    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext()
    {
        return next;
    }
    public void setNext(INode next) {
        this.next = next;
    }
    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("MyNode{"+"key=").append(key).append('}');
        if(next != null)
            myNodeString.append("->").append(next);
        return myNodeString.toString();
    }

    public static void main(String[] args){
       System.out.println("Welcome in data Structure");
       MyNode<Integer>  myFirstNode = new MyNode<>(56);
       MyNode<Integer>  mySecondNode = new MyNode<>(30);
       MyNode<Integer>  myThirdNode = new MyNode<>(70);
       myFirstNode.setNext(mySecondNode);
       mySecondNode.setNext(myThirdNode);

   }
}
