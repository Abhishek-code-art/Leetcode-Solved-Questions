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
	static int spanningTree(int V, int E, int edges[][]){
	    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
	    for(int i = 0; i < V; i++) {
	        adj.add(new ArrayList<Pair>());
	    }
	    
	    for(int i = 0; i < E; i++) {
	        int u = edges[i][0];
	        int v = edges[i][1];
	        int w = edges[i][2];
	        
	        adj.get(u).add(new Pair(v, w));
	        adj.get(v).add(new Pair(u, w));
	    }
	    
	    PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
	        public int compare(Pair p1, Pair p2) {
	            if(p1.weight > p2.weight) {
	                return 1;
	            } else if(p1.weight == p2.weight) {
	                return 0;
	            } else {
	                return -1;
	            }
	        }
	    });
	    
	    boolean[] visited = new boolean[V];
	    int[] key = new int[V];
	    Arrays.fill(key, Integer.MAX_VALUE);
	    
	    minHeap.add(new Pair(0, 0));
	    key[0] = 0;
	    
	    while(!minHeap.isEmpty())  {
	        Pair top = minHeap.poll();
	        
	        if(visited[top.node]) continue;
	        
	        visited[top.node] = true;
	        
	        ArrayList<Pair> neighbours = adj.get(top.node);
	        for(Pair neighbour : neighbours) {
	            
	            if(!visited[neighbour.node] && neighbour.weight < key[neighbour.node]) {
	                
	                key[neighbour.node] = neighbour.weight;
	                
	                minHeap.add(new Pair(neighbour.node, neighbour.weight));
	            }
	        }
	    }
	    
	    int ans = 0;
	    for(int i : key) {
	        ans += i;
	    }
	    
	    return ans;
	}
}

class Pair {
    int node;
    int weight;
    
    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}