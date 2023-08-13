//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long[] dp;
    static long m = 1000000007;
    static int nthFibonacci(int n){
        if(n == 0) return 0;
        if(n <= 2) return 1;
        
        dp = new long[n+1];
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1]%m + dp[i-2]%m)%m;
        }
        return (int)(dp[n]%m);
    }
    
    // private static int solve(int n) {
    //     if(n == 0) return 0;
    //     if(n == 1) return 1;
        
    //     if(dp[n] != -1) return dp[n];
        
    //     return dp[n] = solve(n-1) + solve(n-2);
    // }
}