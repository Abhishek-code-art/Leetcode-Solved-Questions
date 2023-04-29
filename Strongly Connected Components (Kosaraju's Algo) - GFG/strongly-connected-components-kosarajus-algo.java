//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                dfs(i, adj, st, visited);
            }
        }
        
        Map<Integer, ArrayList<Integer>> transpose = new HashMap<>();
        for(int i = 0; i < V; i++) {
            visited[i] = false;
            ArrayList<Integer> nbr = adj.get(i);
            for(int j : nbr) {
                ArrayList<Integer> list = transpose.getOrDefault(j,
                                            new ArrayList<>());
                list.add(i);
                transpose.put(j, list);
            }
        }
        
        int count = 0;
        while(!st.isEmpty()) {
            int top = st.pop();
            if(!visited[top]) {
                count++;
                revDfs(top, visited, transpose);
            }
        }
        
        return count;
    }
    
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st, boolean[] visited) {
        visited[node] = true;
        ArrayList<Integer> nbr = adj.get(node);
        for(int i : nbr) {
            if(!visited[i]) {
                dfs(i, adj, st, visited);
            }
        }
        
        st.push(node);
    }
    
    private void revDfs(int node, boolean[] visited, Map<Integer, ArrayList<Integer>> adj) {
        visited[node] = true;
        
        ArrayList<Integer> list = adj.getOrDefault(node, new ArrayList<>());
        for(int i : list) {
            if(!visited[i]) {
                revDfs(i, visited, adj);
            }
        }
    }
}