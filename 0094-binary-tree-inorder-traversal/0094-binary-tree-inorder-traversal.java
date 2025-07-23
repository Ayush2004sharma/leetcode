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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer>s = new ArrayList<>();
        if(root==null)return s;
      
        s.addAll(inorderTraversal(root.left));
          s.add(root.val);
        s.addAll(inorderTraversal(root.right));
        
        return s;
    }
}