//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    private static int MOD = 1000000007;
    static long[] dp;
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
    
    private static long solve(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = (solve(n-1)%MOD + solve(n-2)%MOD + 
        solve(n-3)%MOD)%MOD;
    }
    
}

