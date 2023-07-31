//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            long []prices=new long[N];
            for(int i=0;i<N;i++){
                prices[i]=sc.nextLong();
            }
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long[][] dp;
    public long maximumProfit(long prices[], int N){
        dp = new long[N+2][2];
        
        for(int i = N-1; i>=0; i--) {
            for(int buy = 0; buy <= 1; buy++) {
                if(buy == 1) {
                    long take = -prices[i] + dp[i+1][0];
                    long not_take = dp[i+1][1];
                    dp[i][buy] = Math.max(take, not_take);
                } else {
                    long sell = prices[i] + dp[i+2][1];
                    long not_sell = dp[i+1][0];
                    dp[i][buy] = Math.max(sell, not_sell);
                }
            }
        }
        return dp[0][1];
    }
    
    private long solve(long[] prices, int i, int buy, int n) {
        if(i >= n) return 0;
        
        if(dp[i][buy] != -1) return dp[i][buy];
        
        if(buy == 1) {
            long take = -prices[i] + solve(prices, i+1, 0, n);
            long not_take = solve(prices, i+1,buy, n);
            return dp[i][buy] = Math.max(take, not_take);
        } else {
            long sell = prices[i] + solve(prices, i+2, 1, n);
            long not_sell = solve(prices,i+1, 0, n);
            return dp[i][buy] = Math.max(sell, not_sell);
        }
    }
}
