class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);  // To handle exact match from the beginning

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            int remaining = sum - k;
            if (hm.containsKey(remaining)) {
                count += hm.get(remaining); // Add all the ways this can happen
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1); // Track prefix sum frequency
        }

        return count;
    }
}
