class Solution {
    public static int size(ListNode head){
        int s = 0;
        while(head != null){
            head = head.next;
            s++;
        }
        return s;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int s = size(head);
        
        if (n == s) return head.next; // removing head
        
        int count = 0;
        ListNode temp = head;
        while (count < s - n - 1) {
            temp = temp.next;
            count++;
        }
        
        temp.next = temp.next.next;
        return head;
    }
}
