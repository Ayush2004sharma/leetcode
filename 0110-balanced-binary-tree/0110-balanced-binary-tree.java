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
    private int diff=Integer.MIN_VALUE;
    public boolean isBalanced(TreeNode root) {
        func(root);
        return diff<2;
    }

    int func(TreeNode root){
        if(root==null)return 0;
        int lh = func(root.left);
        int rh = func(root.right);
        diff= Math.max(diff,Math.abs(lh-rh));
        return 1+Math.max(lh,rh);
        
    }
}