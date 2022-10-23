class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= min) min = nums[i];
            
            if(nums[i] >= max) max = nums[i];
            
        }
        
        int rem = 0;
        while(max%min != 0) {
            rem = max%min;
            max = min;
            min = rem;
        }
        
        return min;
    }
}