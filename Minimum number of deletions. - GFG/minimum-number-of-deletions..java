//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    
    int[][] dp;
    int minDeletions(String str, int n)
    {
        dp = new int[n+1][n+1];
        for(int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        return n - solve(str,rev,0,0,n);
    }
    
    private int solve(String s1, String s2, int i, int j, int n) {
        if(i >= n || j >= n) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + solve(s1,s2,i+1,j+1,n);
        } else {
            return dp[i][j] = Math.max(solve(s1,s2,i+1,j,n), solve(s1,s2,i,j+1,n));
        }
    }
} 