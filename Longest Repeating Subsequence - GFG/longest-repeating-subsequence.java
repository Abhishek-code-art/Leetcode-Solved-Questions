//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int[][] dp;
    public int LongestRepeatingSubsequence(String str)
    {
        int m = str.length();
        int n = str.length();
        dp = new int[m][n];
        for(int[] a : dp) {
            Arrays.fill(a,-1);
        }
        return solve(str, m-1, n-1);
    }
    
    private int solve(String s, int i, int j) {
        if(i < 0 || j < 0) return 0;
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        if(s.charAt(i) == s.charAt(j) && i!=j) {
            return dp[i][j] = 1+solve(s, i-1, j-1);
        } else {
            return dp[i][j] = Math.max(solve(s, i, j-1), solve(s, j-1, i));
        }
    }
}