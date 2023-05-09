class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int size = mat.length;
        
        for(int i = 0; i < size; i++) {
            res += mat[i][i];
            res += mat[i][size - i - 1];
        }
        
        return (size%2 == 0) ? res:(res - mat[size/2][size/2]);
    }
}