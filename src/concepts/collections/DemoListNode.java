package concepts.collections;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}

public class DemoListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a linked list: 10 -> 20 -> 30
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;
     // Traversing the linked list and printing the values
        System.out.println("Linked List:");
        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }


        System.out.println("Linked List:");
        current = node1;

        System.out.println("Check current value " + current.val);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

	}

}
