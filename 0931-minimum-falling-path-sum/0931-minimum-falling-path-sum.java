class Solution {
    int ans;
    int[][] dp;
    public int minFallingPathSum(int[][] grid) {
        ans = Integer.MAX_VALUE;
        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m][n];
        
        for(int i = 0; i < n; i++) {
            dp[0][i] = grid[0][i];
        }

        for(int i = 1; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int down = Integer.MAX_VALUE, ld = Integer.MAX_VALUE, rd = Integer.MAX_VALUE;
                down = grid[i][j] + dp[i-1][j];
                if(j > 0) ld = grid[i][j] + dp[i-1][j-1];
                if(j < n-1) rd = grid[i][j] + dp[i-1][j+1];

                dp[i][j] = Math.min(down, Math.min(ld,rd));
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(dp[m-1][i] < ans) ans = dp[n-1][i];
        }
        return ans;
    }
}