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
        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) return i;
        }
        return 0;
    }
}