import java.util.*;
class Solution {

    public boolean findSubarrays(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        
        for(int i = 1; i < nums.length; i++) {
            ans.add(nums[i] + nums[i-1]);
        }
        
        if((nums.length - 1) == ans.size()) {
            return false;
        }
        
        return true;
    }
};