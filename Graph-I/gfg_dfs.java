// Striver's SDE Sheet - Graph 1 - GFG - Java

// Q. DFS in Graph

// Time Complexity: For an undirected graph, O(N) + O(2E), For a directed graph, O(N) + O(E), 
// Because for every node we are calling the recursive function once, the time taken is O(N) and 2E is for total degrees as we traverse for all adjacent nodes.
// Space Complexity: O(3N) ~ O(N), Space for dfs stack space, visited array and an adjacency list.

import java.util.ArrayList;

public class gfg_dfs {
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        
        for(Integer i: adj.get(node)){
            if(vis[i]==false) dfs(i,vis,adj,ls);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
