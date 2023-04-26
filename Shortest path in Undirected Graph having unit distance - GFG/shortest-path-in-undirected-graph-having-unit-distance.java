//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        // boolean[] visited = new boolean[n];
        // int[] parent = new int[n];
        // parent[src] = -1;
        // visited[src] = true;
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()) {
            int front = q.poll();
            for(int i : adj.get(front)) {
                // if(!visited[i]) {
                    // visited[i] = true;
                    // parent[i] = front;
                    // q.add(i);
                // }
                if(dist[front] + 1 < dist[i]) {
                        dist[i] = dist[front] + 1;
                        q.add(i);
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
        
        return dist;
    }
}