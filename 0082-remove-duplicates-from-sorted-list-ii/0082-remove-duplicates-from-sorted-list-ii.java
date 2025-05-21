class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node before the head
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        
        while (head != null) {
            // If it's a beginning of duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with the same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev to the node after the duplicates
                prev.next = head.next;
            } else {
                // Move prev only if no duplicate found
                prev = prev.next;
            }
            head = head.next;
        }
        
        return dummy.next;
    }
}
