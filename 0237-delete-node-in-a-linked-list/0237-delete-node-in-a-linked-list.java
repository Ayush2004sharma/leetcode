class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // If the node or the next node is null, we can't delete it
            return;
        }
        
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        // Point the current node's next pointer to the next node's next pointer
        node.next = node.next.next;
    }
}