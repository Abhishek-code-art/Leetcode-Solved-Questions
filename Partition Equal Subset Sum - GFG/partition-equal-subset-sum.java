//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int n = arr.length;
        int sum = 0;
        
        for(int num : arr) sum += num;
        
        if(sum%2 != 0) return 0;
        else {
            sum /= 2;
            int ans = subsetSum(arr, sum);
            return ans;
        }
    }
    
    private static int subsetSum(int[] nums, int sum) {
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        
        for(int i = 0; i <= sum; i++) {
            dp[0][i] = false;
        }
        
        for(int j = 0; j <= nums.length; j++) {
            dp[j][0] = true;
        }
        
        for(int i = 1; i <= nums.length; i++) {
            for(int j = 1; j <= sum; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j - nums[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[nums.length][sum] ? 1:0;
    }
} 