class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> map; // freq of nums2 elements

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map = new HashMap<>();

        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        // Update map frequencies
        map.put(oldVal, map.get(oldVal) - 1);
        if (map.get(oldVal) == 0) map.remove(oldVal);

        map.put(newVal, map.getOrDefault(newVal, 0) + 1);

        nums2[index] = newVal;
    }

    public int count(int tot) {
        int res = 0;

        for (int n1 : nums1) {
            int target = tot - n1;
            res += map.getOrDefault(target, 0);
        }

        return res;
    }
}
