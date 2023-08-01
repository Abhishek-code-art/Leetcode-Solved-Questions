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
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp;
    static int palindromicPartition(String str)
    {
        dp = new int[501][501];
        for(int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        return solve(str, 0, str.length()-1);
    }
    
    private static int solve(String s, int i, int j) {
        if(i >= j) return 0;
        if(isPalindrome(s,i,j)) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
    
        int ans = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int temp = solve(s, i, k) + solve(s, k+1, j) + 1;
            
            ans = Math.min(ans, temp);
        }
        return dp[i][j] = ans;
    }
    
    private static boolean isPalindrome(String s, int i, int j) {
        while(i <= j) {
            // System.out.println("str length = " + s.length() + ", i = " + i + ", j = " + j);
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}