class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode(0);
        ListNode preHead = pre;
        ListNode post = new ListNode(0);
        ListNode postHead = post;
        
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val < x) {
                pre.next = curr;
                pre = pre.next;
            } else {
                post.next = curr;
                post = post.next;
            }
            curr = curr.next; // ✅ You missed this!
        }

        post.next = null; // Important to avoid cycle
        pre.next = postHead.next;
        
        return preHead.next;
    }
}
