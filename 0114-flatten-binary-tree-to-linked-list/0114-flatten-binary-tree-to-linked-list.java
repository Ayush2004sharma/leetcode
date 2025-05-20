class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode leftSubtree = root.left;
        TreeNode rightSubtree = root.right;

        root.left = null;
        root.right = leftSubtree;

        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }

        current.right = rightSubtree;
    }
}
