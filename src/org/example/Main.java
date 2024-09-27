package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Список после добавления элементов:");
        list.printList();

        System.out.println("Удаленный элемент: " + list.remove());
        System.out.println("Список после удаления элемента:");
        list.printList();
    }
}
