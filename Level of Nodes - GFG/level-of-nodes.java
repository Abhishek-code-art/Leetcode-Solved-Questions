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
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        int level = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
        boolean[] visited = new boolean[V];
        visited[0] = true;
        
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            
            if(pair.node == X) return pair.level;
            
            for(int nbr : adj.get(pair.node)) {
                if(visited[nbr]) continue;
                q.add(new Pair(nbr, pair.level+1));
                visited[nbr] = true;
            }
        }
        
        return -1;
    }
}

class Pair {
    int node;
    int level;
    Pair(int n, int l) {
        node = n;
        level = l;
    }
}