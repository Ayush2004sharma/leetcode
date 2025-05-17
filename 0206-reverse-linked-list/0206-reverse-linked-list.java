class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;  // Store next node
            curr.next = prev;               // Reverse the link
            prev = curr;                    // Move prev forward
            curr = nextNode;                // Move curr forward
        }
        
        return prev;
    }
}
