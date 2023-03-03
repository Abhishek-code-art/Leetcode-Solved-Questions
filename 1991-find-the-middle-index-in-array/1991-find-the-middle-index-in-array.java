class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum;
            leftSum += nums[i];
            if(leftSum == rightSum) return i;
        }
        
        return -1;
    }
}