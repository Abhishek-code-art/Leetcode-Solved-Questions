class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        
        if(n == 1) {
            List<String> temp = new ArrayList<>();
            temp.add("Q");
            ans.add(temp);
            return ans;
        }
        
        solve(0, board, ans, n);
        
        return ans;
    }
    
    private void solve(int col, int[][] board, List<List<String>> ans, int n) {
        if(col == n) {
            addSolution(board, ans, n);
            return;
        }
        
        for(int row = 0; row<n; row++) {
            if(isSafe(row, col, board, n)) {
                board[row][col] = 1;
                solve(col+1, board, ans, n);
                board[row][col] = 0;
            }
        }
    }
    
    private void addSolution(int[][] board, List<List<String>> ans, int n) {
        List<String> temp = new ArrayList<>();
        
        for(int i = 0; i<n; i++) {
            String str = "";
            for(int j = 0; j<n; j++) {
                if(board[i][j] == 1) {
                    str = str+"Q";
                } else {
                    str = str+".";
                }
            }
            temp.add(str);
        }
        
        ans.add(temp);
    }
    
    private boolean isSafe(int row, int col, int[][] board, int n) {
        int x=row;
        int y=col;
        
        while(y >= 0) {
            if(board[x][y] == 1) return false;
            y--;
        }
        
        x = row;
        y = col;
        
        while(x>=0 && y>=0) {
            if(board[x][y] == 1) return false;
            y--;
            x--;
        }
        
        x = row;
        y = col;
        
        while(x<n && y>=0) {
            if(board[x][y] == 1) return false;
            y--;
            x++;
        }
        
        return true;
    }
}