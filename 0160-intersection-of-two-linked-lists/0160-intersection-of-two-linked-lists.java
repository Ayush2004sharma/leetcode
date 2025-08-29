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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;
        HashSet<ListNode>hs= new HashSet<>();
        while(tb!=null){
            hs.add(tb);
            tb=tb.next;
        }
        while (ta != null) {
            if(hs.contains(ta))return ta;
            ta=ta.next;

        }
        return null;
    }
}