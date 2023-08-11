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
    long[][] dp;
    public long count(int coins[], int N, int sum) {
        dp = new long[N+1][sum+1];
        for(long arr[] : dp) Arrays.fill(arr,-1);
        return solve(coins, N-1,sum);
    }
    
    private long solve(int[] coins, int index, int sum) {
        if(sum == 0) return 1;
        if(index < 0) return 0;
        
        if(dp[index][sum] != -1) return dp[index][sum];
        
        long not_take = solve(coins, index-1, sum);
        
        long take = 0;
        if(coins[index] <= sum) {
            take += solve(coins, index, sum - coins[index]);
        }
        
        return dp[index][sum] = (take+not_take);
    }
}