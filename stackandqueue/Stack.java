package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class Stack<K>
{
    private final LinkedList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkedList();
    }


    public void push(INode element) {
        stackLinkedList.add(element);
    }


    public void printStack() {
        stackLinkedList.printLinkedList();
    }
}
