class Solution {
    public boolean search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > nums[lo]) {
                if(nums[mid] > target && target >= nums[lo]) hi = mid;
                else lo = mid+1;
            } else if(nums[mid] < nums[lo]) {
                if(nums[mid] < target && target < nums[lo]) lo = mid+1;
                else hi = mid;
            } else {
                lo++;
            }
        }
        return false; 
    }
}