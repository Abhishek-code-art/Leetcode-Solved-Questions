class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = n;
        int col = n;
        
        int count = 1;
        int total = n*n;
        
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;
        
        while(count <= total) {
            for(int i = startingCol; count <= total && i <= endingCol; i++) {
                matrix[startingRow][i] = count;
                count++;
            }
            startingRow++;
            
            for(int i = startingRow; count <= total && i <= endingRow; i++) {
                matrix[i][endingCol] = count;
                count++;
            }
            endingCol--;
            
            for(int i = endingCol; count <= total && i >= startingCol; i--) {
                matrix[endingRow][i] = count;
                count++;
            }
            endingRow--;
            
            for(int i = endingRow; count <= total && i >= startingRow; i--) {
                matrix[i][startingCol] = count;
                count++;
            }
            startingCol++;
        }
        return matrix;
    }
}