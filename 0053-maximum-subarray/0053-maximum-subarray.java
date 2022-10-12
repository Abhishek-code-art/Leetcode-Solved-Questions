class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        
        // Kadane's algorithm
        for(int i = 0; i < nums.length; i++) {
            //step 1
            sum += nums[i];
            // ste 2
            maxSum = Math.max(maxSum, sum);
            // step3
            if(sum < 0) sum = 0;
        }
        
        return maxSum;
    }
}