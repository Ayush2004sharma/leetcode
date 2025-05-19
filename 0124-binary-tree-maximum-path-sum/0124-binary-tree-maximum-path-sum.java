class Solution {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }

    private int maxGain(TreeNode node) {
        if (node == null) return 0;

        int leftGain = Math.max(0, maxGain(node.left));
        int rightGain = Math.max(0, maxGain(node.right));

        int currentPathSum = node.val + leftGain + rightGain;

        max = Math.max(max, currentPathSum);

        return node.val + Math.max(leftGain, rightGain);
    }
}
