class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int ans =0;
        double maxD=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int l =arr[i][0];
            int w=arr[i][1];
          double dl= Math.sqrt(l*l+w*w);
          int area =l*w;
          if(dl>maxD){
            ans=area;
            maxD=dl;
           }
           else if (dl==maxD){
            ans = Math.max(ans, area);
           }
        }
        return ans ;
    }
}