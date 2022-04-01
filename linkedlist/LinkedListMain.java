package com.bridgelabz.linkedlist;

public class LinkedListMain
{
    public static void main(String[] args) {

        System.out.println("----- Welcome to Data Structure: Linked List -----");

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);

//        myLinkedList.popLast();
//        //myLinkedList.printMyNodes();
//        boolean result = myLinkedList.head.equals(firstNode) &&
//                myLinkedList.tail.equals(secondNode);
//        myLinkedList.assertTrue(result);
        System.out.println("Linked list before deletion: ");
        myLinkedList.printLinkedList();
        INode deletedNode = myLinkedList.deleteLastNode();
        System.out.println("The deleted key value is:"+deletedNode.getKey());

    }
}
