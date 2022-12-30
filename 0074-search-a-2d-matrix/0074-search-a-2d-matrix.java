class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = m*n - 1;
        
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}