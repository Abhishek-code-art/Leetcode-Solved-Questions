//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp;
    static int knapSack(int N, int W, int val[], int wt[])
    {
        dp = new int[N+1][W+1];
        for(int[] arr : dp) Arrays.fill(arr,-1);
        return solve(0, W, val, wt, N);
    }
    
    private static int solve(int i, int w, int[] val, int[] wt, int n) {
        if(i >= n || w <= 0) return 0;
        if(dp[i][w] != -1) return dp[i][w];
        
        if(wt[i] <= w) {
            return dp[i][w] = Math.max(val[i]+solve(i,w-wt[i],val,wt,n), solve(i+1,w,val,wt,n));
        } else {
            return dp[i][w] = solve(i+1,w,val,wt,n);
        }
    }
}