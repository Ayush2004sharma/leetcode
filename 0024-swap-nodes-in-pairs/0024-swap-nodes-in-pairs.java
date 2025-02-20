class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head; // Base case: empty list or single node

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swapping the pairs
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move `prev` two steps ahead
            prev = first;
        }

        return dummy.next;
    }
}
