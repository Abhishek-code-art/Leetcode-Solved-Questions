class Solution {
    public int fib(int n) {
        // bottom up approach : tabulation
        if(n == 0) return 0;
        if(n == 1) return 1;
        
//         int[] dp = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
        
//         for(int i = 2; i <= n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
        
//         return dp[n];
        
        int prev1 = 1;
        int prev2 = 0;
        
        for(int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}