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
        ListNode dum = head;
        int count = 0;
        while (dum != null) {
            count++;
            dum = dum.next;
        }
        return count;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        int size = size(head) / 2;
        int count = 0;
        while (count < size) {
            head = head.next;
            count++;

        }
        return head;
    }
}