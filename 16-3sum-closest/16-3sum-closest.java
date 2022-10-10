import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while(left < right) {
                int tempSum  = nums[i] + nums[left] + nums[right];
                if(Math.abs(tempSum - target) < Math.abs(sum - target)) sum = tempSum;
                
                if(tempSum > target) {
                    right--;
                } else if(tempSum < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        
        return sum;
    }
}