class Solution {
    public int minOperations(int[] nums, int k) {
         PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) pq.add(num);
        
        int count = 0;
        while (pq.peek() < k) {
            if (pq.size() < 2) return -1;  // Not enough elements to merge
            
            long a = pq.poll();
            long b = pq.poll();
            long  q = (a * 2) + b;
            pq.add(q);
            count++;
        }
        return count;
    }
}