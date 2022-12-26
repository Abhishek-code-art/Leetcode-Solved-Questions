class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        return ans;
    }
    
    public int firstOcc(int[] arr, int key) {
        int n = arr.length;
        int lo = 0;
        int hi = arr.length-1;
        int ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if(arr[mid] == key) {
                ans = mid;
                hi = mid - 1;
            } else if(arr[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    public int lastOcc(int[] arr, int key) {
        int n = arr.length;
        int lo = 0;
        int hi = arr.length-1;
        int ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if(arr[mid] == key) {
                ans = mid;
                lo = mid + 1;
            } else if(arr[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}