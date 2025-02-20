class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) { // Remove leading nodes with val
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with val
            } else {
                current = current.next;
            }
        }
        return head;
    }
}