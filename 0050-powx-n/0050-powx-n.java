class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long temp = n;
        if(temp < 0) temp = -1*temp;
        while(temp > 0) {
            if(temp%2 == 1) {
                ans = ans*x;
                temp = temp-1;
            } else {
                x = x*x;
                temp = temp/2;
            }
        }
        if(n < 0) ans = 1.0/ans;
        return ans;
    }
}