class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int ans = binarySearch(nums, lo, hi);
        return ans;
    }
    
    public int binarySearch(int[] nums, int lo, int hi) {
        if(lo >= hi) return nums[lo];
        
        int mid = (lo+hi)/2;
        if(((mid&1) == 0 && nums[mid] == nums[mid+1]) || ((mid&1) == 1 && nums[mid] == nums[mid-1])) {
            return binarySearch(nums, mid+1, hi);
        } else {
            return binarySearch(nums, lo, mid);
        }
    }
}