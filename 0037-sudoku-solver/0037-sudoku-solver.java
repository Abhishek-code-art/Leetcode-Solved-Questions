class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    private boolean solve(char[][] board) {
        int n = board.length;
        
        for(int row = 0; row<n; row++) {
            for(int col = 0; col<n; col++) {
                if(board[row][col] == '.') {
                    for(int val = 1; val<=9; val++) {
                        if(isSafe(row, col, board, val)) {
                            board[row][col] = (char)(val + '0');
                            boolean nextSol = solve(board);
                            if(nextSol) return true;
                            else {
                                // backtrack
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isSafe(int row, int col, char[][] board, int val) {
        int n = board.length;
        char ch = (char)(val + '0');
        for(int i = 0; i < n; i++) {
            if(board[row][i] == ch) return false;
            if(board[i][col] == ch) return false;
            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == ch) return false;
        }
        return true;
    }
} 