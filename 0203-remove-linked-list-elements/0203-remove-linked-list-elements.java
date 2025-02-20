class Solution {

    public static ListNode deleteNode(ListNode head, int target) {
        if (head == null) return null;
        if (head.val == target) return head.next;

        ListNode current = head;
        while (current.next != null && current.next.val != target) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) { // Handle head deletions
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Delete node
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
