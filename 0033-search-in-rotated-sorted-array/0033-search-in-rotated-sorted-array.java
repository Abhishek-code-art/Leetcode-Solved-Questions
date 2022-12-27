class Solution {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums, nums.length);
        if(target >= nums[pivot] && target <= nums[nums.length-1]) {
            return binarySearch(nums, pivot, nums.length-1, target);
        } else {
            return binarySearch(nums, 0, pivot-1, target);
        }
    }
    
    public int getPivot(int[] nums, int n) {
        int lo = 0;
        int hi = n-1;
        while(lo < hi) {
            int mid = (lo+hi)/2;
            if(nums[mid] >= nums[0]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
    
    public int binarySearch(int[] nums, int s, int e, int target) {
        int lo = s;
        int hi = e;
        
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
}