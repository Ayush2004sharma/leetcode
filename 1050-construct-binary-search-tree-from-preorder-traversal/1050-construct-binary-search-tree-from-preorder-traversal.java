class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] index = new int[1];  // Mutable index
        return build(preorder, index, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] arr, int[] index, int bound) {
        if (index[0] == arr.length || arr[index[0]] > bound) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index[0]++]);
        root.left = build(arr, index, root.val);       // left subtree should be < root
        root.right = build(arr, index, bound);         // right subtree can go up to bound

        return root;
    }
}
