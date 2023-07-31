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
                prices[i]=sc.nextInt();
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
        dp = new long[N+1][2];
        for(int i = N-1; i>=0; i--) {
            for(int buy = 0; buy <= 1; buy++) {
                if(buy == 1) {
                    long take = -prices[i] + dp[i+1][0];
                    long not_take = dp[i+1][1];
                    dp[i][buy] = Math.max(take,not_take);
                } else {
                    long sell = prices[i] + dp[i+1][1];
                    long not_sell = dp[i+1][buy];
                    dp[i][buy] = Math.max(sell,not_sell);
                }
            }
        }
        return dp[0][1];
    }
    private long solve(int index, int buy, long[] prices, int n) {
        if(index >= n) return 0;
        
        if(dp[index][buy] != -1) return dp[index][buy];
        
        if(buy == 1) {
            long take = -prices[index] + solve(index+1,0,prices,n);
            long not_take = solve(index+1, 1, prices, n);
            return dp[index][buy] = Math.max(take, not_take);
        } else {
            long sell = prices[index] + solve(index+1,1,prices,n);
            long not_sell = solve(index+1,0,prices,n);
            return dp[index][buy] = Math.max(sell,not_sell);
        }
    }
}