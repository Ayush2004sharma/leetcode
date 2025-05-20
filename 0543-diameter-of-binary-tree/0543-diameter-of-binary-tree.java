/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int h = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    func(root);
    return h ;    
    }
    int func(TreeNode root){
        if(root==null)return 0;
        int lh = func(root.left);
        int rh = func(root.right);
        h=Math.max(h,lh+rh);
        return 1+Math.max(lh,rh);
    }

}
