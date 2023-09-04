//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        int[][] visited = new int[n][m];
        
        for(int i = 0; i < m; i++) {
            if(a[0][i] == 'O' && visited[0][i] == 0) {
                dfs(a, visited, 0, i, n, m);
            }
        }
        
        
        for(int i = 0; i < m; i++) {
            if(a[n-1][i] == 'O' && visited[n-1][i] == 0) {
                dfs(a, visited, n-1, i, n, m);
            }
        }
        
        for(int j = 0; j < n; j++) {
            if(a[j][0] == 'O' && visited[j][0] == 0) {
                dfs(a, visited, j, 0, n, m);
            }
        }
        
        for(int j = 0; j < n; j++) {
            if(a[j][m-1] == 'O' && visited[j][m-1] == 0) {
                dfs(a, visited, j, m-1, n, m);
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i][j] == 'O' && visited[i][j] == 0) {
                    a[i][j] = 'X';
                }
            }
        }
        
        return a;
    }
    
    private static void dfs(char[][] a, int[][] visited, int i, int j, int n, int m) {
        if(i>=0 && j>=0 && i<n && j<m && a[i][j]=='O' && visited[i][j]==0) {
            visited[i][j] = 1;
            dfs(a, visited, i+1, j, n, m);
            dfs(a, visited, i, j+1, n, m);
            dfs(a, visited, i-1, j, n, m);
            dfs(a, visited, i, j-1, n, m);
        }
    }
} 