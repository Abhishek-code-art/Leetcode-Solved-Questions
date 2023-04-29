//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    private int timer;
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        timer = 0;
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] mark = new int[V];
        boolean[] visited = new boolean[V];
        
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(i, -1, disc, low, visited, adj, mark);
            }
        }
        
        for(int i = 0; i < V; i++) {
            if(mark[i] == 1) {
                ans.add(i);
            }
        }
        if(ans.size() == 0) {
            ans.add(-1);
        }
        return ans;
    }
    
    private void dfs(int node, int parent, int[] disc, 
    int[] low, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int[] mark) {
        
        visited[node] = true;
        disc[node] = low[node] = timer++;
        int child = 0;
        
        ArrayList<Integer> neighbours = adj.get(node);
        for(int neighbour : neighbours) {
            if(neighbour == parent) continue;
            
            if(!visited[neighbour]) {
                dfs(neighbour, node, disc, low, visited, adj, mark);
                
                low[node] = Math.min(low[node], low[neighbour]);
                if(low[neighbour] >= disc[node] && parent != -1) {
                    mark[node] = 1;
                } 
                child++;
            } else {
                low[node] = Math.min(low[node], disc[neighbour]);
            }
        }
        
        if(parent == -1 && child > 1) {
            mark[node] = 1;
        }
    }
}