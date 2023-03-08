class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = (int)Math.pow(10,9);
        int ans = hi;
        
        while(lo < hi) {
            int mid = lo+(hi-lo)/2;
            int totalTime = 0;
            for(int i = 0; i < piles.length; i++) {
                totalTime += piles[i]/mid;
                if(piles[i]%mid > 0) {
                    totalTime++;
                }
            }
            
            if(totalTime > h) {
                lo = mid+1;
            } else {
                ans = Math.min(ans, mid);
                hi = mid;
            }
        }
        return ans;
    }
}