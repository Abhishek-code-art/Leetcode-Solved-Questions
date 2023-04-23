//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<ArrayList<Node>> adj = new ArrayList<>();
		for(int i = 0; i < N; i++) {
		    adj.add(new ArrayList<Node>());
		}
		
		for(int i = 0; i < M; i++) {
		    int u = edges[i][0];
		    int v = edges[i][1];
		    int w = edges[i][2];
		    
		    Node node = new Node(v, w);
		    adj.get(u).add(node);
		}
		
		
		boolean[] visited = new boolean[N];
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < N; i++) {
		    if(!visited[i]) {
		        dfs(i, adj, visited, st);
		    }
		}
		
		int[] dist = new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;
		
		while(!st.isEmpty()) {
		    int top = st.pop();
		    if(dist[top] != Integer.MAX_VALUE) {
		        for(Node i : adj.get(top)) {
		            if(dist[top] + i.weight < dist[i.value]) {
		                dist[i.value] = dist[top] + i.weight;
		            }
		        }
		    }
		}
		
		for(int i = 0; i < N; i++) {
		    if(dist[i] == Integer.MAX_VALUE) {
		        dist[i] = -1;
		    }
		}
		
		return dist;
	}
	
	private void dfs(int node, ArrayList<ArrayList<Node>> adj, boolean[] visited, Stack<Integer> st) {
	    visited[node] = true;
	    for(Node neighbour : adj.get(node)) {
	        if(!visited[neighbour.value]) {
	            dfs(neighbour.value, adj, visited, st);
	        }
	    }
	    st.push(node);
	}
}

class Node {
    int value;
    int weight;
    
    Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}