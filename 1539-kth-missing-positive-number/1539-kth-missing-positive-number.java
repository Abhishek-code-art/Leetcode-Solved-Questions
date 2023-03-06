class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo/2);
            int cnt = arr[mid] - (mid+1);
            if(cnt < k) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return lo+k;
    }
}