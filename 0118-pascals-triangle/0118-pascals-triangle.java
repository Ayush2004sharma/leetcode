class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>l = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer>a= new ArrayList<>();
            int ans =1;
            for(int j=0;j<=i;j++){
                a.add(ans);
                ans =ans* (i - j) / (j + 1);
               
            }
            l.add(a);
        }
        return l;
    }
}