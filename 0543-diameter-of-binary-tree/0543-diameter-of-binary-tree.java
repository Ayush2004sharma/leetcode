class Solution {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update diameter at this node
        max = Math.max(max, leftHeight + rightHeight);

        // Return height
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
