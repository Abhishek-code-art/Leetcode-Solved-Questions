class Solution {
    public int mySqrt(long x) {
        if(x == 0) return 0;
        long lo = 1;
        long hi = x;
        long ans = 1;
        
        while(lo <= hi) {
            long mid = lo + (hi-lo)/2;
            long square = mid*mid;
            if(square == x) return (int)mid;
            else if(square < x) {
                ans = mid;
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return (int)ans;
    }
}