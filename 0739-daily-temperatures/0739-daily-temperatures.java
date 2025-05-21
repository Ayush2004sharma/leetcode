class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n =t.length;
        int ans[]=new int [n];
        Stack<Integer>s= new Stack<>();
        for(int i =0;i<n;i++){
            while(!s.empty()&&t[s.peek()]<t[i]){
                Integer pop=s.pop();
                ans[pop]= i-pop;
            }
            s.push(i);
        }
        return ans;
    }
}