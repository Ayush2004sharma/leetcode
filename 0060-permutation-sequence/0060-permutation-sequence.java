class Solution {
    public String getPermutation(int g, int k) {
        List<Integer>n=new ArrayList<>();
        int fact=1;
        for(int i =1;i<g;i++){
            fact=fact*i;
            n.add(i);
        }
        n.add(g);
        String ans="";
        k=k-1;
        while(true){
            ans= ans+n.get(k/fact);
            n.remove(k/fact);
            if(n.size()==0){
                break;
            }
            k=k%fact;
            fact= fact/n.size();

        }
        return ans ;
    }
}