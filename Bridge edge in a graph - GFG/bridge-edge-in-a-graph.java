//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.isBridge(V,list,c,d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    private static int timer;
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
         timer = 0;
         int[] disc = new int[V];
         int[] low = new int[V];
         boolean[] visited = new boolean[V];
         Arrays.fill(disc, -1);
         Arrays.fill(low, -1);
         
         ArrayList<Pair> ans = new ArrayList<>();
         for(int i = 0; i < V; i++) {
             if(!visited[i]) {
                 dfs(i, -1, disc, low, visited, adj, ans);
             }
         }
         
         for(int i = 0; i < ans.size(); i++) {
             if((c == ans.get(i).u && d == ans.get(i).v) || (c == ans.get(i).v && d == ans.get(i).u)) {
                 return 1;
             } 
         }
         
         return 0;
    }
    
    private static void dfs(int node, int parent, int[] disc, int[] low, boolean[] visited,
        ArrayList<ArrayList<Integer>> adj, ArrayList<Pair> ans) {
            visited[node] = true;
            
            disc[node] = low[node] = timer++;
            for(int neighbour : adj.get(node)) {
                if(neighbour == parent) continue;
                
                if(!visited[neighbour]) {
                    dfs(neighbour, node, disc, low, visited, adj, ans);
                    
                    low[node] = Math.min(low[node], low[neighbour]);
                    
                    // bridge condition
                    if(low[neighbour] > disc[node]) {
                        Pair p = new Pair(node, neighbour);
                        ans.add(p);
                    }
                } else {
                    // back edge condition
                    low[node] = Math.min(low[node], disc[neighbour]);
                }
            }
        }
}

class Pair {
    int u;
    int v;
    
    Pair(int n1, int n2) {
        u = n1;
        v = n2;
    }
}