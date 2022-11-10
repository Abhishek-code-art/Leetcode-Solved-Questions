class Solution {
    public int maxScore(int[] nums, int k) {
        int totalSum = 0;
        for(int i = 0; i < k; i++) totalSum += nums[i];
        
        int maxScore  = totalSum;
        for(int i = k-1, j = nums.length-1; i>=0; i--,j--) {
            totalSum += nums[j] - nums[i];
            maxScore = Math.max(maxScore, totalSum);
        }
        return maxScore;
    }
}