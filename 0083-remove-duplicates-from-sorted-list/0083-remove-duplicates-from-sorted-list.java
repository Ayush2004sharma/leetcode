class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next; // Skip duplicate node
            } else {
                temp = temp.next; // Move to next unique node
            }
        }
        return head; // Return original head
    }
}
