class Solution {
    public long minimumTime(int[] time, int k) {
        long lo = 0;
        long hi = 0;
        for(int i = 0; i < time.length; i++) {
            if(time[i] > hi) {
                hi = time[i];
            }
        }
        
        hi = hi*k;
        long ans = hi;
        
        while(lo < hi) {
            long mid = lo + (hi-lo)/2;
            long cnt = 0;
            for(int i = 0; i < time.length; i++) {
                cnt += mid/time[i];
            }
            if(cnt >= k) {
                ans = Math.min(ans, mid);
                hi = mid;
            } else {
                lo = mid+1;
            }
        }
        return ans;
    }
}