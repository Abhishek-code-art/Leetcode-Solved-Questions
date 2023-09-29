//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int mod = 1000000007;
    static int[][] dp;
    static int uniquePaths(int n, int m, int[][] grid) {
        if(grid[0][0] == 0) return 0;
        if(grid[n-1][m-1] == 0) return 0;
        
        dp = new int[n+1][m+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        
        return solve(n-1,m-1,grid);
    }
    
    private static int solve(int n, int m, int[][] grid) {
        if(n == 0 && m == 0) return 1;
        if(n < 0 || m < 0) return 0;
        if(grid[n][m] == 0) return 0;
        
        if(dp[n][m] != -1) return dp[n][m];
        
        return dp[n][m] = (solve(n-1, m, grid)%mod + solve(n, m-1, grid)%mod)%mod;
    }
}