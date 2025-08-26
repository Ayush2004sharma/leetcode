class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums); 
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3; 
        int count = 1;  
        int prev = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
            } else {
                if (count > threshold) {
                    result.add(prev); 
                }
                prev = nums[i];
                count = 1;
            }
        }

        // check last element group
        if (count > threshold) {
            result.add(prev);
        }

        return result;
    }
}
