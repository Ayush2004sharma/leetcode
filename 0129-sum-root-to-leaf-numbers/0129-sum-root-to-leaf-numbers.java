class Solution {
    public int sumNumbers(TreeNode root) {
        return func(root, 0);
    }

    int func(TreeNode root, int sum) {
        if (root == null) return 0;

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) return sum;

        return func(root.left, sum) + func(root.right, sum);
    }
}
