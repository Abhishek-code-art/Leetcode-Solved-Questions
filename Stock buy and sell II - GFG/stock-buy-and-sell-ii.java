//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    private static int[][] dp;
    public static int stockBuyAndSell(int n, int[] prices) {
        dp = new int[n+1][2];
        for(int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        return solve(prices, 0, 1, n);
    }
    
    private static int solve(int[] prices, int index, int buy, int n) {
        if(index >= n) return 0;

        if(dp[index][buy] != -1) return dp[index][buy];

        if(buy == 1) {
            int take = -prices[index] + solve(prices, index+1, 0, n);
            int not_take = solve(prices, index+1, buy, n);
            return dp[index][buy] = Math.max(take, not_take);
        } else {
            int sell = prices[index] + solve(prices, index+1, 1, n);
            int not_sell = solve(prices, index+1, 0, n);
            return dp[index][buy] = Math.max(sell,not_sell);
        }
    }
}
        
