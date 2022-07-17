package com.blz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("----- Welcome to Data Structure: Linked List -----");

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkList myLinkedList = new LinkList();
        myLinkedList.addNode(firstNode);
        myLinkedList.append(thirdNode);
        System.out.println("Inserting 30 between 56 and 70");
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.display();

    }
}