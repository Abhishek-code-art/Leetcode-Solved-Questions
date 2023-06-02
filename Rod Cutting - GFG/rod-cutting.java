//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    private int max;
    public int cutRod(int price[], int n) {
        int[][] dp = new int[price.length+1][n+1];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int[] length = new int[price.length];
        for(int i = 1; i <= n; i++) {
            length[i-1] = i;
        }
        return solve(price, length, n, n, dp);
    }
    
    private int solve(int[] price, int[] length, int n, int i, int[][] dp) {
        if(n == 0 || i == 0) return 0;
        if(dp[i][n] != -1) return dp[i][n];
        
        int notTake = 0 + solve(price, length, n, i-1, dp);
        int take = Integer.MIN_VALUE;
        if(length[i-1] <= n) {
            take = price[i-1]+solve(price, length, n-length[i-1], i, dp);
        }
        
        dp[i][n] = Math.max(take, notTake);
        
        return dp[i][n];
    }
}