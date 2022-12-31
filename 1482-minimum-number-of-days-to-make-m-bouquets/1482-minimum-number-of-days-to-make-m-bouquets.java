class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int lo = 0;
        int hi = bloomDay[0];
        for(int i = 1; i < bloomDay.length; i++) {
            if(hi < bloomDay[i]) hi = bloomDay[i];
        }
        int res = -1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(bloomDay, m, k, mid)) {
                res = mid;
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return res;
    }
    
    public boolean isPossible(int[] arr, int m, int k, int mid) {
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= mid) {
                c++;
                if(c == k) {
                    m--;
                    c = 0;
                }
            } else {
                c = 0;
            }
        }
        if(m <= 0) return true;
        return false;
    }
}