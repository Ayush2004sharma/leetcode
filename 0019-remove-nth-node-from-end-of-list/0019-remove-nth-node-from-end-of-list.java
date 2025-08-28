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
    public int  size(ListNode head){
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        if(head.next==null&&n==1)return null;
        
        int size=size(head)-n-1;
        int count=0;
        ListNode temp = head;

  // Case: removing head itself
    if (size < 0) {
        return head.next;
    }
        while(temp!=null &&temp.next!=null){
            if(count==size){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
}