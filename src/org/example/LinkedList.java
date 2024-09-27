package org.example;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }


    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Integer remove() {
        if (head == null) {
            System.out.println("Список пуст, невозможно удалить элемент.");
            return null;
        }
        int removedData = head.data;
        head = head.next;
        return removedData;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}