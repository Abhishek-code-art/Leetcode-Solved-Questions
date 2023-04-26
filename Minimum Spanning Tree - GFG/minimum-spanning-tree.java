//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    private static int[] parent;
    private static int[] rank;
    
	static int spanningTree(int V, int E, int edges[][]){
	    ArrayList<Pair> adj = new ArrayList<>();
	    for(int i = 0; i < edges.length; i++) {
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int w = edges[i][2];
	        
	        adj.add(new Pair(u, v, w));
	    }
	    
	    parent = new int[V];
	    rank = new int[V];
	    
	    for(int i = 0; i < V; i++) {
	        parent[i] = i;
	    }
	    
	    Collections.sort(adj, new Comparator<Pair>() {
	        public int compare(Pair p1, Pair p2) {
	            if(p1.w > p2.w) {
	                return 1;
	            } else if(p1.w == p2.w) {
	                return 0;
	            } else {
	                return -1;
	            }
	        }
	    });
	    int minWeight = 0;
	    
	    for(int i = 0; i < adj.size(); i++) {
	        int u = findParent(adj.get(i).u);
	        int v = findParent(adj.get(i).v);
	        int weight = adj.get(i).w;
	        
	        if(u != v) {
	            minWeight += weight;
	            unionSet(u, v);
	        }
	    }
	    
	    return minWeight;
	}
	
	private static int findParent(int node) {
	    if(parent[node] == node) {
	        return node;
	    }
	    
	    return parent[node] = findParent(parent[node]);
	}
	
	private static void unionSet(int u, int v) {
	    u = findParent(u);
	    v = findParent(v);
	    
	    if(rank[u] < rank[v]) {
	        parent[u] = v;
	    } else if(rank[u] > rank[v]) {
	        parent[v] = u;
	    } else {
	        parent[v] = u;
	        rank[u]++;
	    }
	}
}

class Pair {
   int u;
   int v;
   int w;
    
    Pair(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}