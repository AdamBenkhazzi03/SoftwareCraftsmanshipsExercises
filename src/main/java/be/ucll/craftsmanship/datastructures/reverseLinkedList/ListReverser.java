package be.ucll.craftsmanship.datastructures.reverseLinkedList;

//Given the head of a singly linked list, reverse the list, and return the reversed list
//Goal: Change the next pointer of each node to point to the previous node.


public class ListReverser {
    public static ListNode reverse(ListNode head) {

        ListNode previous = null;
        ListNode current = head;
        while (current.getNext() != null) {
            ListNode nextTemp = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextTemp;
        }

        return previous;
    }
}
