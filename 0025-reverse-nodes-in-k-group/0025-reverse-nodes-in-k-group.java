class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        int count = 0;
        
        // Count k nodes to check if we can reverse
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }

        if (count == k) {
            ListNode prev = null, curr = head, next = null;
            int i = 0;
            
            // Reverse k nodes
            while (i < k && curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                i++;
            }
            
            // Recursively call for the next part
            head.next = reverseKGroup(curr, k);
            
            return prev; // New head after reversing k-group
        }

        return head; // If fewer than k nodes remain, return as is
    }
}
