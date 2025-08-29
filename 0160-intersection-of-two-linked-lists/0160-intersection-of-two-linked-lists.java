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
    public int size(ListNode head){
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;
         int size= Math.abs(size(headA)-size(headB));
         if(size(headA)<size(headB)){
            for(int i =0;i<size;i++){
                tb=tb.next;
            }
         }
         else{
              for(int i =0;i<size;i++){
                ta=ta.next;
            }
         }
        while (ta != null&&tb!=null) {
         if(ta==tb)return ta ;
         ta=ta.next;
         tb=tb.next;
        }
        return null;
    }
}