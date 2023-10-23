//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int[][] dp;
	public int maxSumIS(int arr[], int n)  
	{  
	    dp = new int[n+1][n];
	    for(int[] nums : dp) Arrays.fill(nums, -1);
	    return solve(-1,0,arr,n);
	}  
	
	private int solve(int prev, int curr, int[] arr, int n) {
	    if(curr == n) return 0;
	    if(dp[prev+1][curr] != -1) return dp[prev+1][curr];
	    
	    int take = 0;
	    if(prev == -1 || arr[prev] < arr[curr]) {
	        take = arr[curr] + solve(curr, curr+1, arr, n);
	    }
	    
	    int not_take = solve(prev, curr+1, arr, n);
	    
	    return dp[prev+1][curr] = Math.max(take, not_take);
	}
}