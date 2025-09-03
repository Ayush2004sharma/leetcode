class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for ( int i =0;i<n;i++){
            adj.add( new ArrayList<>());
        }
        for ( int i=0;i<n;i++){
            for( int j :graph[i]){
                adj.get(i).add(j);
            }
        }
        int[] vis = new int[n];
        Arrays.fill(vis, -1);
        for(  int i =0;i<n;i++){
                if(vis[i]==-1){
                    if(!dfs(i,0,adj, vis))return false;
            }
        }
        return true;
    }

    public boolean dfs( int start ,int color, ArrayList<ArrayList<Integer>>adj, int vis[]){
        
        vis[start]=color;
      
            for( int it:adj.get(start)){
                if( vis[it]==-1){
                    if (!dfs(it, 1 - color, adj, vis)) return false;
                }
                else if ( vis[it]==vis[start]){
                    return false;
                
            }
        }
        return true;

    }
}