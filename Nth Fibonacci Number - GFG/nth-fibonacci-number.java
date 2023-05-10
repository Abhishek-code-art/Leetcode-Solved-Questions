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
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    private static long m = 1000000007;
    static long nthFibonacci(long n){
        long[] dp = new long[(int)(n+1)];
        dp[0] = 0;
        dp[1] = 1;
        
        for(long i = 2; i <= n; i++) {
            dp[(int)i] = (dp[(int)i-1]%m + dp[(int)i-2]%m)%m;
        }
        
        return dp[(int)n]%m;
    }
}