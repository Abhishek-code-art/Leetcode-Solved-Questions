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
        int n = str.length();
        dp = new int[n+1][n+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return solve(str, str, n, n, n);
    }
    
    private int solve(String s1, String s2, int i, int j, int n)  {
        if(i == 0 || j == 0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(i!=j && s1.charAt(i-1) == s2.charAt(j-1)) {
            return dp[i][j] =  1 + solve(s1,s2,i-1,j-1,n);
        } else {
            return dp[i][j] = Math.max(solve(s1,s2,i-1,j,n),solve(s1,s2,i,j-1,n));
        }
    }
}