class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupTail = dummy;
        ListNode curr = head;

        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        curr = head;
        while (length >= k) {
            ListNode prev = null;
            ListNode tail = curr;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            prevGroupTail.next = prev;
            tail.next = curr;
            prevGroupTail = tail;
            length -= k;
        }

        return dummy.next;
    }
}
