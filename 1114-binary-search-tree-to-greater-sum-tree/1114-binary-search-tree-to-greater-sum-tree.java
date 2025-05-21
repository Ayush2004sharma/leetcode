
public class Solution {
    private int prefix = 0;

    public TreeNode bstToGst(TreeNode root) {
        reversedInorder(root);
        return root;
    }

    private void reversedInorder(TreeNode root) {
        if (root == null)
            return;

        reversedInorder(root.right);

        root.val += prefix;
        prefix = root.val;

        reversedInorder(root.left);
    }
}