class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int lo = 0;
        // int hi = arr.length - 1;
        // while(lo < hi) {
        //     int mid = (lo+hi)/2;
        //     if(arr[mid] < arr[mid+1]) {
        //         lo = mid + 1;
        //     } else {
        //         hi = mid;
        //     }
        // }
        // return lo;
        int lo = 0;
        int hi = arr.length-1;
        int ans = recursiveApproach(arr, lo, hi);
        return ans;
    }
    
    public int recursiveApproach(int[] arr, int lo, int hi) {
        if(lo >= hi) return lo;
        
        int mid = (lo+hi)/2;
        if(arr[mid] < arr[mid+1]) {
            return recursiveApproach(arr, mid+1, hi);
        } else {
            return recursiveApproach(arr, lo, mid);
        }
    }
}