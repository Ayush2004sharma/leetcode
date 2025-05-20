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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return func(root.left,root.right);
    }
    public boolean func(TreeNode q,TreeNode p){
        
        if(q==null&&p==null)return true;
        if(q==null||p==null)return false;
        if(p.val!=q.val)return false;

        return func(q.right,p.left)&&func(q.left,p.right);
    }
}