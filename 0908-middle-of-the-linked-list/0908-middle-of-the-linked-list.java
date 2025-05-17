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
    public static int size(ListNode head ){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode temp= head;
        while(temp!=null &&temp.next!=null){
            count++;
            temp=temp.next;
        }
return count;
    } 
    public static ListNode middleNode(ListNode head) {
        int s = size(head);
        if(s%2==0){
            s=(s/2);
        }
        else{
            s=(s/2)+1;
        }

        int count=0;
        ListNode temp = head;
        while(count!=s&& temp.next!=null){
            head=head.next;
            count++;
        }
        return head;
    }
}