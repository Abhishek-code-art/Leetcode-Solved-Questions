//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends

class Solution{
    int[][] dp;
    int ans;
    int longestCommonSubstr(String s1, String s2, int n, int m){
        dp = new int[n+1][m+1];
        ans = 0;
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        
        solve(s1, s2, n, m);
        return ans;
    }
    
    private int solve(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0) return 0;
        
        if(dp[n][m] != -1) return dp[n][m];
        
        int substring_length = 0;
        
        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            substring_length = 1 + solve(s1, s2, n-1, m-1);
            ans = Math.max(substring_length, ans);
        }
        
        solve(s1, s2, n, m-1);
        solve(s1, s2, n-1, m);
        
        return dp[n][m] = substring_length;
    }
}