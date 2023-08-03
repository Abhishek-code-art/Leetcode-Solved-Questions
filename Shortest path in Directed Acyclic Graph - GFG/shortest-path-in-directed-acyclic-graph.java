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
    
    private void dfs(int node, boolean[] visit, ArrayList<ArrayList<Pair>> adj, Stack<Integer> st) {
        visit[node] = true;
        for(Pair p : adj.get(node)) {
            if(!visit[p.node]) {
                dfs(p.node, visit, adj, st);
            }
        }
        st.push(node);
    }

	public int[] shortestPath(int N,int M, int[][] edges) {
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for(int i = 0; i < N; i++) {
		    adj.add(new ArrayList<Pair>());
		}
		
		for(int i = 0; i < M; i++) {
		    int u = edges[i][0];
		    int v = edges[i][1];
		    int d = edges[i][2];
		    
		    Pair p = new Pair(v,d);
		    adj.get(u).add(p);
		}
		
		Stack<Integer> st = new Stack<>();
		boolean[] visit = new boolean[N];
		for(int i = 0; i < N; i++) {
		    if(!visit[i]) {
		        dfs(i,visit,adj,st);
		    }
		}
		
		int[] dist = new int[N];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[0] = 0;
	
		while(!st.isEmpty()) {
		    int top = st.pop();
		    if(dist[top] != Integer.MAX_VALUE) {
    		    ArrayList<Pair> nbrs = adj.get(top);
    		    for(Pair nbr : nbrs) {
    		        if(dist[top]+nbr.dist < dist[nbr.node]) {
    		            dist[nbr.node] = dist[top]+nbr.dist;
    		        }
    		    }
		    }
		}
		
		for(int i = 0; i < N; i++) {
		    if(dist[i] == Integer.MAX_VALUE) dist[i] = -1;
		}
		return dist;
	}
}

class Pair {
    int node;
    int dist;
    Pair(int n, int d) {
        node = n;
        dist = d;
    }
}