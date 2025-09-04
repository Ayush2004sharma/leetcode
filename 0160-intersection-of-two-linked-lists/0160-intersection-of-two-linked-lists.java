/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size(ListNode head) {
        int d = 0;
        ListNode he = head;
        while (he != null) {
            he = he.next;
            d++;
        }
        return d;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = size(headA);
        int b = size(headB);
        int size = Math.abs(a - b);
        if (a < b) {
            for (int i = 0; i < size; i++) {
                headB = headB.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                headA = headA.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;

        }
        return null;
    }
}