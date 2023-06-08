//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().maxProduct(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    long max;
    long maxProduct(int n) {
        if(n == 1) return 0;
        long[][] dp = new long[n+1][n+1];
        for(long[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return solve(n, n-1, dp);
    }
    
    private long solve(int length, int cut, long[][] dp) {
        if(length == 0 || cut == 0) {
            return 1;
        }
        
        if(dp[length][cut] != -1) return dp[length][cut];
        
        if(cut <= length) {
            return dp[length][cut] = Math.max(solve(length-cut, cut, dp)*cut, solve(length, cut-1, dp));
        } else {
            return dp[length][cut] = solve(length, cut-1, dp);
        }
    }
}