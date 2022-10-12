class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        
        if(nums.length == 1 && nums[0] != 7) return 0;
            
        while(j < nums.length) {
            sum += nums[j];
            
            if(sum < target) j++;
            
            if(sum >= target) {
                while(sum >= target) {
                    ans = Math.min(ans, j-i+1);
                    sum -= nums[i];
                    i++;
                } 
                j++;
            }
        }
        
        ans = (ans == Integer.MAX_VALUE) ? 0:ans;
        return ans;
    }
}