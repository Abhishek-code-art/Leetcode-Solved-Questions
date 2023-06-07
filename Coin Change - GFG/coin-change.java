//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        long[][] dp = new long[N+1][sum+1];
        for(long[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        
        return solve(coins, N, sum, dp);
    }
    
    long solve(int[] coins, int i, int sum, long[][] dp) {
        if(sum == 0) return 1;
        if(i == 0) return 0;
        
        if(dp[i][sum] != -1) return dp[i][sum];
        
        long notTake = solve(coins, i-1, sum, dp);
        
        long take = 0;
        if(coins[i-1] <= sum) {
            take += solve(coins, i, sum - coins[i-1], dp);
        }
        
        dp[i][sum] = Math.max(dp[i-1][sum], take + notTake);
        return dp[i][sum];
    }
}