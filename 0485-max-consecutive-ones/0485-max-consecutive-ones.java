class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        
        if(nums.length == 1 && nums[0] == 1) {
            return 1;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        
        return maxCount;
    }
}