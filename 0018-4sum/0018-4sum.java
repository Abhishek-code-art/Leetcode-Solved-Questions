import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        if(nums == null && nums.length < 4) return ans;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                int left = j+1;
                int right = nums.length - 1;
                
                while(left < right) {
                    long target_2 = (long)target - (long)(nums[i] + nums[j]);
                    
                    if(nums[left] + nums[right] < target_2) left++;
                    else if(nums[left] + nums[right] > target_2) right--;
                    else {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        
                        ans.add(quad);
                        
                        while(left<right && nums[left+1] == nums[left]) left++;
                        while(left<right && nums[right-1] == nums[right]) right--;
                        
                        left++;
                        right--;
                    }
                }
                
                while(j+1 < nums.length && nums[j] == nums[j+1]) ++j;
                
            }
            
            while(i+1 < nums.length && nums[i] == nums[i+1]) ++i;
        }
        
        return ans;
    }
}