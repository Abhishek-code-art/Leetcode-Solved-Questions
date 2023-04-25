//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        
        int[] dist = new int[V];
        for(int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;    
        }
        
        PriorityQueue<Node> st = new PriorityQueue<>(new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                if(n1.distance > n2.distance) {
                    return 1;
                } else if(n1.distance == n2.distance) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        
        boolean[] visited = new boolean[V];
        dist[S] = 0;
        st.add(new Node(S, 0));
        
        while(!st.isEmpty()) {
            Node top = st.poll();
            
            if(visited[top.node]) continue;
            
            visited[top.node] = true;
            
            ArrayList<ArrayList<Integer>> neighbours = adj.get(top.node);
            for(ArrayList<Integer> neighbour : neighbours) {
                int vertex = neighbour.get(0);
                int weight = neighbour.get(1);
                if(top.distance + weight < dist[vertex]) {
                    dist[vertex] = top.distance + weight;
                    st.add(new Node(vertex, dist[vertex]));
                }
            }
        }
        
        return dist;
    }
}

class Node {
    int node;
    int distance;
    
    Node(int val, int dist) {
        node = val;
        distance = dist;
    }
}
