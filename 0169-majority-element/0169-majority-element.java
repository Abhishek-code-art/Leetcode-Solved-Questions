import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(count == 0) {
                count++;
                ans = nums[i];
            } else if(nums[i] == ans) {
                count++;
            } else count--;
        }
        
        return ans;
    }
}