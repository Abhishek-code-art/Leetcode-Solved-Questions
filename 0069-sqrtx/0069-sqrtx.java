class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        // int lo = 1;
        // int hi = x;
        // while(lo < hi) {
        //     int mid = lo + (hi-lo)/2;
        //     if(mid <= x/mid && (mid+1) > x/(mid+1)) return mid;
        //     else if(mid > x/mid) hi = mid;
        //     else lo = mid+1;
        // }
        // return lo;
        return newtonSqrt(x);
    }
    public int newtonSqrt(int n) {
        long i = n;
        while(i > n/i) {
            i = (i+n/i)/2;
        }
        return (int)i;
    }
}