//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        int[][] dp = new int[N+1][sum+1];
        for(int[] num : dp) {
            Arrays.fill(num, -1);
        }
        if(solve(arr, sum, N, dp) == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    private static int solve(int[] arr, int sum, int n, int[][] dp) {
        if(sum == 0) {
            return dp[n][0] = 1;
        }
        
        if(n <= 0) return 0;
        
        
        if(dp[n][sum] != -1) return dp[n][sum];
        
        if(arr[n-1] <= sum) {
            boolean ans = (solve(arr, sum - arr[n-1], n-1, dp) == 1) || (solve(arr, sum, n-1, dp) == 1);
            if(ans) {
                dp[n][sum] = 1;
                return 1;
            } else {
                dp[n][sum] = 0;
                return 0;
            }
        } else {
            return dp[n][sum] = solve(arr, sum, n-1, dp);
        }
    }
} 