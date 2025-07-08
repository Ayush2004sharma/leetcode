class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l = new ArrayList<>();
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int n :nums){
          hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        int k = nums.length/3;
         for (int key : hm.keySet()) {
            if(hm.get(key)>k){
                l.add(key);
            }
         }
        return l;
    }
}