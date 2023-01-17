class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        return binarySearch(x, 1, x);
        // int lo = 1;
        // int hi = x;
        // while(lo < hi) {
        //     int mid = lo + (hi-lo)/2;
        //     if(mid <= x/mid && (mid+1) > x/(mid+1)) return mid;
        //     else if(mid > x/mid) hi = mid;
        //     else lo = mid+1;
        // }
        // return lo;
        // return newtonSqrt(x);
    }
    // public int newtonSqrt(int n) {
    //     long i = n;
    //     while(i > n/i) {
    //         i = (i+n/i)/2;
    //     }
    //     return (int)i;
    // }
    
    public int binarySearch(int x, int lo, int hi) {
        if(lo >= hi) return lo;
        
        int mid = lo + (hi-lo)/2;
        if(mid <= x/mid && (mid+1) > x/(mid+1)) {
            return mid;
        }
        else if(mid > x/mid) {
            return binarySearch(x, lo, mid);
        }
        else {
            return binarySearch(x,mid+1,hi);
        }
    }
}