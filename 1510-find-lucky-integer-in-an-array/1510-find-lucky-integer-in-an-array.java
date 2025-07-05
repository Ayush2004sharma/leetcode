class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int item : arr) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }
        int ans=-1;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value &&ans<key) {
                ans=key;
        }
      
    }
      return ans;

}
}