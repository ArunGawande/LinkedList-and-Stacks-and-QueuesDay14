package com.bridgelabz.linkedlist;

public class LinkedList {

    private INode head;
    private INode tail;

    public LinkedList() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }

    }

    public void append (INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempINode = this.tail;
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode previousNode, INode newNode) {
        INode temporaryNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(temporaryNode);
    }

    public INode deleteFirst() {
        INode temporaryNode = this.head;
        this.head = this.head.getNext();
        return temporaryNode;

    }

//    public INode popLast()
//    {
//        INode tempNode = head;
//        while (!tempNode.getNext().equals((tail))){
//            tempNode = tempNode.getNext();
//        }
//        this.tail = tempNode;
//        tempNode = tempNode.getNext();
//        return tempNode;
//    }
public INode deleteLastNode() {
    INode temporaryNode = head;
    while(!temporaryNode.getNext().equals(tail)) {
        temporaryNode = temporaryNode.getNext();
    }
    this.tail = temporaryNode;
    temporaryNode = temporaryNode.getNext();
    return temporaryNode;
}


    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }
}
