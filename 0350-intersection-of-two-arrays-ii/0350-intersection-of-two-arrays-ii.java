class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for (int num : nums1) {
            l.add(num);
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (l.contains(nums2[i])) {
                p.add(nums2[i]);
                l.remove(Integer.valueOf(nums2[i]));
            }

        }

        int[] array = p.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}