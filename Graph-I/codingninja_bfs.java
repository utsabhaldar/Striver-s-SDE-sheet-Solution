// Striver's SDE Sheet - Graph 1 - Coding Ninja - Java

// Q. BFS in Graph

// Time Complexity: O(N) + O(2E), Where N = Nodes, 2E is for total degrees as we traverse all adjacent nodes.
// Space Complexity: O(3N) ~ O(N), Space for queue data structure visited array and an adjacency list

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class codingninja_bfs {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i: adj.get(node)){
            if(vis[i]==false){
                vis[i]=true;
                q.add(i);
            }
        }
    }
    return bfs;
}
}
