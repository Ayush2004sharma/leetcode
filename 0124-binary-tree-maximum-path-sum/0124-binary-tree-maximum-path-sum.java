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
    private int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        func(root);
        return max;
    }
    int func(TreeNode root){
        if(root==null)return 0;
        int lh=Math.max(0,func(root.left));
        int rh=Math.max(0,func(root.right));
        int curr= root.val +lh+rh;
        max = Math.max(max,curr);
        return root.val+Math.max(lh,rh);
    }
}