class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if(((mid&1) == 0 && nums[mid] == nums[mid+1]) || ((mid&1) == 1 && nums[mid] == nums[mid-1])) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }
}