/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int size(ListNode head) {
        int c = 0;
        ListNode t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        int n =k%size(head);
        if(n==0)return head;
        ListNode slow = head;
        ListNode start = slow;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode end = slow.next;
        slow.next = null;
        fast.next = start;

        return end;
    }
}