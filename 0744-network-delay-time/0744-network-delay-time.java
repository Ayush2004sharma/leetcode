import java.util.*;

class Pair {
    int d, n;
    Pair(int d, int n) {
        this.d = d;
        this.n = n;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Step 1: Build adjacency list
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] e : times) {
            int u = e[0] - 1, v = e[1] - 1, w = e[2]; // convert to 0-based
            adj.get(u).add(new Pair(w, v));
        }

        // Step 2: Dijkstra
        int[] dist = new int[n];
        Arrays.fill(dist, (int) 1e9);
        dist[k - 1] = 0; // source

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.d - b.d);
        pq.add(new Pair(0, k - 1));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int dis = cur.d, node = cur.n;

            if (dis > dist[node]) continue; // skip outdated

            for (Pair it : adj.get(node)) {
                int newDist = dis + it.d;
                if (newDist < dist[it.n]) {
                    dist[it.n] = newDist;
                    pq.add(new Pair(newDist, it.n));
                }
            }
        }

        // Step 3: Get answer
        int max = 0;
        for (int d : dist) {
            if (d == (int) 1e9) return -1; // unreachable node
            max = Math.max(max, d);
        }
        return max;
    }
}
