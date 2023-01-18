class Solution {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums, nums.length, 0, nums.length-1);
        if(target >= nums[pivot] && target <= nums[nums.length-1]) {
            return binarySearch(nums, pivot, nums.length-1, target);
        } else {
            return binarySearch(nums, 0, pivot-1, target);
        }
    }
    
    public int getPivot(int[] nums, int n, int lo, int hi) {
        // int lo = 0;
        // int hi = n-1;
        // while(lo < hi) {
        //     int mid = (lo+hi)/2;
        //     if(nums[mid] >= nums[0]) {
        //         lo = mid + 1;
        //     } else {
        //         hi = mid;
        //     }
        // }
        // return lo;
        if(lo >= hi) return lo;
        
        int mid = (lo+hi)/2;
        if(nums[mid] >= nums[0]) {
            return getPivot(nums, n, mid+1, hi);
        } else {
            return getPivot(nums, n, lo, mid);
        }
    }
    
    public int binarySearch(int[] nums, int lo, int hi, int target) {
//         int lo = s;
//         int hi = e;
        
//         while(lo <= hi) {
//             int mid = (lo+hi)/2;
//             if(nums[mid] == target) return mid;
//             else if(nums[mid] < target) lo = mid+1;
//             else hi = mid-1;
//         }
//         return -1;
        if(lo > hi) return -1;
        
        int mid = (lo+hi)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) {
            return binarySearch(nums, mid+1, hi, target);
        } else {
            return binarySearch(nums, lo, mid-1, target);
        }
    }
}