// Striver's SDE Sheet - Graph 1 - GFG - Detect cycle in an undirected graph - BFS - Java

// Time Complexity: O(N + 2E) + O(N), Where N = LinkedNodes, 2E is for total degrees as we traverse all adjacent nodes. 
// In the case of connected components of a graph, it will take another O(N) time.
// Space Complexity: O(N) + O(N) ~ O(N), Space for queue data structure and visited array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class gfg_detect_cycle_undir_graph_bfs {
    
    static boolean check(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[], int par[]){
        Queue<LinkedNode> q = new LinkedList<>();
        q.add(new LinkedNode(s, -1));
        vis[s] = true;
        
        while(!q.isEmpty()){
            int n = q.peek().first;
            int p = q.peek().second;
            q.remove();
            for(Integer i: adj.get(n)){
                if(vis[i]==false){
                    q.add(new LinkedNode(i, n));
                    vis[i] = true;
                }
                else if(p!=i) return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        int par[] = new int[V];
        Arrays.fill(par, -1);
        for(int i=0; i<V; i++){
            if(vis[i] == false){
                if(check(adj, i , vis, par)) return true;
            }
        }
        return false;
    }
}
class LinkedNode {
    int first;
    int second;

    public LinkedNode(int first, int second) {
        this.first = first;
        this.second = second;
    }
}