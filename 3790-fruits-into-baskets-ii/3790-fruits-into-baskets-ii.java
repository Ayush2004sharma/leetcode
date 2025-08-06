class Solution {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer>l= new ArrayList<>();
         for(int j:baskets){
            l.add(j);
         }
 
         int count =fruits.length;
         for(int n:fruits){
         for(int  j=0;j<l.size();j++){
            if(n<=l.get(j)){
                count--;
                l.remove(j);
                break;
            }
         }
         }
         return count;
    }
}