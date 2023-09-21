//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    
    int[] dp;
    public int FindMaxSum(int arr[], int n)
    {
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(arr, 0, n);
    }
    
    private int solve(int[] arr, int i, int n) {
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max(arr[i] + solve(arr, i+2, n), solve(arr, i+1, n));
    }
}