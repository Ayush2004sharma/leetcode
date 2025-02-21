class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        
        // Step 1: Find the middle of the linked list (slow will be at mid)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Step 3: Calculate max twin sum
        int maxSum = 0;
        slow = head;  // Reset slow to head
        fast = prev;  // Fast now points to reversed half

        while (fast != null) {
            maxSum = Math.max(maxSum, slow.val + fast.val);
            slow = slow.next;
            fast = fast.next;
        }
        
        return maxSum;
    }
}
