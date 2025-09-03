class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
          boolean vis[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0]; 
            int v = prerequisites[i][1];
          adj.get(v).add(u);

        }
        boolean pathVis[]= new boolean [n];
        for( int i =0;i<n;i++){
             if(!vis[i]){
                if( dfs(i, adj, vis,pathVis))return false;
             }
        }
       
        return true;
    }

    public boolean dfs(int node , ArrayList<ArrayList<Integer>>adj, boolean vis[],boolean[]pathVis){
        vis[node]=true;
        pathVis[node]=true;
       
            for( int i :adj.get(node)){
                if(!vis[i]){
                  if( dfs(i,adj, vis,pathVis))return true;
                }
                else if (pathVis[i])return true;
            }
            pathVis[node]=false;
         return false;
    }
}