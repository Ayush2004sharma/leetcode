class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char num : s.toCharArray()) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
         int maxOddFreq = Integer.MIN_VALUE;
        int minEvenFreq = Integer.MAX_VALUE;

        for (char num : hm.keySet()) {
            int freq = hm.get(num);

            if (freq % 2 == 0) {  // even
                if (freq < minEvenFreq) {
                    minEvenFreq = freq;
                }
            } else {  // odd
                if (freq > maxOddFreq) {
                    maxOddFreq = freq;
                }
            }
        }
        return maxOddFreq-minEvenFreq;
    }
}