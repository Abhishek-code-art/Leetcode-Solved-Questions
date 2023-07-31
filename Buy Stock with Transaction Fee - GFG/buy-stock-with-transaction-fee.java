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
            int fee=sc.nextInt();
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N,fee);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long[][] dp;
    public long maximumProfit(long prices[], int N, int fee){
        dp = new long[N+1][2];
        for(long[] arr : dp) Arrays.fill(arr,-1);
        return solve(prices, 0, 1, fee, N);
    }
    
    private long solve(long[] prices, int i, int buy, int fee, int n) {
        if(i >= n) return 0;
        
        if(dp[i][buy] != -1) return dp[i][buy];
        
        if(buy == 1) {
            long take = solve(prices, i+1, 0, fee, n) - prices[i];
            long not_take = solve(prices, i+1, buy, fee, n);
            return dp[i][buy] = Math.max(take, not_take);
        } else {
            long sell = solve(prices, i+1, 1, fee, n) + prices[i] - fee;
            long not_sell = solve(prices, i+1, 0, fee, n);
            return dp[i][buy] = Math.max(sell, not_sell);
        }
    }
}