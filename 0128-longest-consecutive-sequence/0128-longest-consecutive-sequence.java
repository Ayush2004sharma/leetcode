class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int n : nums) {
            treeSet.add(n);
        }

        int count = 1;
        int temp = 1;

        Iterator<Integer> it = treeSet.iterator();
        int prev = it.next();  // take first element

        while (it.hasNext()) {
            int n = it.next();
            if (prev + 1 == n) {
                temp++;
            } else {
                temp = 1;
            }
            count = Math.max(count, temp);
            prev = n;
        }

        return count;
    }
}
