class Solution {
    public void sortColors(int[] nums) {
        int countr=0;
        int countw=0;
        int countb=0;
        for(int n :nums){
            if(n==0){
                countr++;
            }
            if(n==1){
                countw++;
            }
            if(n==2){
                countb++;
            }
        }
        int i =0;
        while(i<nums.length){
            if(countr!=0){
                nums[i]=0;
                countr--;
            }
            else if(countw!=0){
                nums[i]=1;
                countw--;
            }
            else if(countb!=0){
                nums[i]=2;
                countb--;
            }
            i++;
        }
    }
}