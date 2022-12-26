class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int x : nums) total += x;
        
        int runningTotal = 0;
        for(int i = 0; i < n; i++) {
            int leftSum = runningTotal;
            runningTotal += nums[i];
            int rightSum = total - runningTotal;
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}