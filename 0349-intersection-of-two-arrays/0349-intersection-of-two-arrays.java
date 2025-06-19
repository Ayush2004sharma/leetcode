class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        HashSet<Integer>hm = new HashSet<>();
        for(int n :nums1){
            hm.add(n);
        }
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i =0;i<nums2.length;i++){
            if(hm.contains(nums2[i])){
               ans.add(nums2[i]);
               hm.remove(nums2[i]);
            }
        }
        int ans1[]= new int [ans.size()];
      for(int i =0;i<ans.size();i++){
        ans1[i]=ans.get(i);
      }
        return ans1 ;
        
    }
}