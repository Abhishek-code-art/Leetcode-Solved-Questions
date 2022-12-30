class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int lo = weights[0];
        int hi = weights[0];
        int res = 0;
        for(int i = 1; i < n; i++) {
            lo = (lo <= weights[i]) ? weights[i]:lo;
            hi += weights[i];
        }
        
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(weights, n, days, mid)) {
                res = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return res;
    }
    
    public boolean isPossible(int[] arr, int n, int d, int mid) {
        int totalWeight = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] + totalWeight <= mid) totalWeight += arr[i];
            else {
                d--;
                if(d <= 0 || arr[i] > mid) return false;
                totalWeight = arr[i];
            }
        }
        return true;
    }
}