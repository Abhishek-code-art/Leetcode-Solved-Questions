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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int num : arr) sum += num;
	    
	    boolean[] possibleSubsetSum = subsetSum(arr, sum);
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    for(int i = 0; i <= possibleSubsetSum.length/2; i++) {
	        if(possibleSubsetSum[i]) {
	            ans.add(i);
	        }
	    }
	    
	    int min = Integer.MAX_VALUE;
	    for(int val : ans) {
	        min = Math.min(min, Math.abs(sum - 2*val));
	    }
	    
	    return min;
	}
	
	private boolean[] subsetSum(int[] arr, int sum) {
	    boolean[][] dp = new boolean[arr.length+1][sum+1];
	    
	    for(int i = 0; i <= sum; i++) {
	        dp[0][i] = false;
	    }
	    
	    for(int j = 0; j <= arr.length; j++) {
	        dp[j][0] = true;
	    }
	    
	    for(int i = 1; i <= arr.length; i++) {
	        for(int j = 1; j <= sum; j++) {
	            if(arr[i-1] <= j) {
	                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
	            } else {
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	    
	    return dp[arr.length];
	}
}
