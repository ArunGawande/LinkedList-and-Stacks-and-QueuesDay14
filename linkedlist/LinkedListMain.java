package com.bridgelabz.linkedlist;

public class LinkedListMain
{
    public static void main(String[] args) {

        System.out.println("----- Welocme to Data Structure: Linked List -----");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printLinkedList();

        System.out.println("Linked list 1 using append");
        MyNode<Integer> Node1 = new MyNode<Integer>(56);
        MyNode<Integer> Node2 = new MyNode<Integer>(30);
        MyNode<Integer> Node3 = new MyNode<Integer>(70);
        LinkedList myLinkedList1 = new LinkedList();
        myLinkedList1.append(Node1);
        myLinkedList1.append(Node2);
        myLinkedList1.append(Node3);
        myLinkedList1.printLinkedList();
    }
}
