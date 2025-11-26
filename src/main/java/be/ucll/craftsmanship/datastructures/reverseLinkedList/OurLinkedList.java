package be.ucll.craftsmanship.datastructures.reverseLinkedList;

public class OurLinkedList {
    private ListNode head;
    private ListNode tail;

    public OurLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public ListNode constructLinkedList(){
        for (int i = 1; i <= 5; i++) {
         var node = new ListNode(i);
         if (head == null) {
             head = node;
         } else {
             tail.setNext(node);
         }
            tail = node;
        }
        return head;
    }
}
