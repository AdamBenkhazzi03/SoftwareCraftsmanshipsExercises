package be.ucll.craftsmanship.datastructures.reverseLinkedList;

import java.util.LinkedList;

public class ReverseLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("creating a linked list");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

      System.out.println("reversing a LinkedList");
        linkedList.reversed().forEach(System.out::println);

        System.out.println("reversing our own singly linked list");
        var headNode = new OurLinkedList().constructLinkedList();

        var reversedLinkedList = ListReverser.reverse(headNode);

    }
}
