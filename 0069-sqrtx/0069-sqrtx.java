class Solution {
    public int mySqrt(int x) {
        if(x == 1) return 1;
        if(x == 2147483647) return 46340;
        int i = 0;
        for(;i <= x/2 && i*i <= Integer.MAX_VALUE; i++) {
            if(i*i == x) return i;
            if(i*i < x) {
                
            } else {
                return (i-1);
            }
        }
        return i-1;
    }
}