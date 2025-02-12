import java.util.Hashtable;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> l = new Hashtable<>();
        for(int num : nums){
            l.put(num, l.getOrDefault(num, 0) + 1);
        }
        for(int num: l.keySet()){
        if (l.get(num) > 1 ) {
                return true;
            }
    }
    return false;
}
}