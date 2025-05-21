class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> sub = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                sub.add(curr.val);

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            if (!leftToRight) {
                Collections.reverse(sub);
            }
            ans.add(sub);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
