class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums.length==0) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int lo = 0;
        int hi = nums.length-1;
        ans[0] = firstOcc(nums, target, lo, hi);
        ans[1] = lastOcc(nums, target, lo, hi);
        return ans;
    }
    
    public int firstOcc(int[] arr, int key, int lo, int hi) {
        if(lo > hi && (lo < arr.length) && arr[lo] == key) return lo;
        if(lo > hi) return -1;
        int mid = (lo+hi)/2;
        if(arr[mid] == key) {
            int ans = mid;
            ans = firstOcc(arr, key, lo, mid-1);
            return ans;
        } else if(arr[mid] < key) {
            return firstOcc(arr, key, mid+1, hi);
        } else {
            return firstOcc(arr, key, lo, mid-1);
        }
    }
    public int lastOcc(int[] arr, int key, int lo, int hi) {
        if(lo > hi && (hi >= 0) && arr[hi] == key) return hi;
        if(lo > hi) return -1;
        
        int mid = (lo+hi)/2;
        if(arr[mid] == key) {
            int ans = mid;
            ans = lastOcc(arr, key, mid+1, hi);
            return ans;
        } else if(arr[mid] > key) {
            return lastOcc(arr, key, lo, mid-1);
        } else {
            return lastOcc(arr, key, mid+1, hi);
        }
    }
}