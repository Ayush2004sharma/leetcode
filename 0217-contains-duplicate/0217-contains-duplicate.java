import java.util.Hashtable;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int m=nums.length;
        HashSet<Integer> l = new HashSet<>();
        for(int num:nums){
            l.add(num);
        }
        if(m!=l.size()){
            return true;
        }
          return false;
            }
  

}