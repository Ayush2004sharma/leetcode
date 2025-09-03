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
                    if(!bfs(i,n,adj, vis))return false;
            }
        }
        return true;
    }

    public boolean bfs( int start ,int V, ArrayList<ArrayList<Integer>>adj, int vis[]){
        Queue<Integer>q= new LinkedList<>();
        q.add(start);
        vis[start]=0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for( int it:adj.get(node)){
                if( vis[it]==-1){
                    vis[it]=1-vis[node];
                    q.add(it);
                }
                else if ( vis[it]==vis[node]){
                    return false;
                }
            }
        }
        return true;

    }
}