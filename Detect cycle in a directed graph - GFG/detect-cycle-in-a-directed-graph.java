//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] dfsVisit = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                boolean ans = checkCycleDFS(i, adj, visited, dfsVisit);
                if(ans) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean checkCycleDFS(int curr, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] dfsVisit) {
        visited[curr] = true;
        dfsVisit[curr] = true;
        
        for(int neighbour : adj.get(curr)) {
            if(!visited[neighbour]) {
                boolean ans = checkCycleDFS(neighbour, adj, visited, dfsVisit);
                if(ans) {
                    return true;
                }
            } else if(dfsVisit[neighbour]) {
                return true;
            }
        }
        
        dfsVisit[curr] = false;
        return false;
    }
}