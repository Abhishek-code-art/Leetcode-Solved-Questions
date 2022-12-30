class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        
        while(row < m && col >= 0) {
            int element = matrix[row][col];
            if(element == target) return true;
            else if(element < target) row++;
            else col--;
        }
        return false;
    }
}