class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];
            adj.get(prereq).add(course); // prereq -> course
        }

        // Step 2: Visited arrays
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses]; // recursion stack

        // Step 3: Run DFS for each unvisited node
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, pathVis)) {
                    return false; // cycle detected → cannot finish
                }
            }
        }
        return true; // no cycle → possible to finish all courses
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited, boolean[] pathVis) {
        visited[node] = true;
        pathVis[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, pathVis)) return true; // cycle found
            } else if (pathVis[neighbor]) {
                return true; // cycle found
            }
        }

        pathVis[node] = false; // backtrack
        return false;
    }
}
