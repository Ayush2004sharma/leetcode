class Solution {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        // max path passing through this node
        max = Math.max(max, left + right + node.val);

        // return max path that can be extended to parent
        return node.val + Math.max(left, right);
    }
}
