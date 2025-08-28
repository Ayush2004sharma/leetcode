class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode prev = null; // to track the last node
        int carry = 0;

        while (t1 != null || t2 != null) {
            int v1 = (t1 != null) ? t1.val : 0;
            int v2 = (t2 != null) ? t2.val : 0;

            int sum = carry + v1 + v2;
            carry = sum / 10;
            int digit = sum % 10;

            if (t1 != null) {
                t1.val = digit;
                prev = t1;
                t1 = t1.next;
            } else {
                // attach new node to l1 if it's shorter
                prev.next = new ListNode(digit);
                prev = prev.next;
            }

            if (t2 != null) t2 = t2.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return l1;
    }
}
