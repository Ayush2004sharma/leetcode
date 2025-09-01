class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

      
        int count = 1; // Start from 1 because we count the head
        ListNode temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Compute the actual rotation needed
        k = k % count;
        if (k == 0) return head; // No rotation needed

        // Step 3: Find the new tail (count - k - 1) and new head (count - k)
        ListNode newTail = head;
        for (int i = 0; i < count - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: Update pointers
        ListNode newHead = newTail.next;
        newTail.next = null;
        temp.next = head; // Connect the last node to the old head

        return newHead;
    }
}
