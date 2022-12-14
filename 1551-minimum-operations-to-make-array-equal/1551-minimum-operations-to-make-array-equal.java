class Solution {
    public int minOperations(int n) {
        int ans = 0;
        if((n&1) == 0) {
            ans = (n*n)/4;
        } else {
            ans = ((n*n) - 1)/4;
        }
        return ans;
    }
}