//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int[][] dp;
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        dp = new int[m+1][n+1];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        
        return m+n-solve(X, Y, m, n);
    }
    
    private static int solve(String x, String y, int n, int m) {
        if(n == 0 || m == 0) return 0;
        
        if(dp[n][m] != -1) return dp[n][m];
        
        if(x.charAt(n-1) == y.charAt(m-1)) {
            return dp[n][m] = 1 + solve(x,y,n-1,m-1);
        } else {
            return dp[n][m] = Math.max(solve(x,y,n-1,m), solve(x,y,n,m-1));
        }
    }
}