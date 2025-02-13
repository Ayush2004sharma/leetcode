class Solution {
    public int thirdMax(int[] nums) {
      int n=nums.length;
      int max=0;
      TreeSet<Integer> s = new TreeSet<>(); 
       for(int i =0;i<n;i++){
        s.add(nums[i]);
       }
       Integer[] arr = s.toArray(new Integer[0]);

if(arr.length>=3){
    max=arr[arr.length-3];
}

else if(arr.length==2){
     max=arr[arr.length-1];
}
 else if(arr.length==1){
     max=arr[arr.length-1];
}     
       return max;
    }
}