class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i=0;i<n;i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];

            adj[u].add(v);
            adj[v].add(u);
        }
        boolean[] vis = new boolean[n];
        int components = 0;
        for (int i=0;i<n;i++) {
            if (!vis[i]) {
                dfs(i,adj,vis);
                components++;
            }
        }
        return components - 1;
    }

    private void dfs(int node,ArrayList<Integer>[] adj,boolean[] vis) {
        vis[node] = true;
        for (int nei : adj[node]) {
            if (!vis[nei]) {
                dfs(nei,adj,vis);
            }
        }
    }
}