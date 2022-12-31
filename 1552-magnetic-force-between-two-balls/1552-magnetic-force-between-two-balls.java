class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo = 1;
        int hi = position[position.length-1] - position[0];
        int res = -1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(isPossible(position, m, mid)) {
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }
    
    public boolean isPossible(int[] arr, int m, int mid) {
        int ballCount = 1;
        int lastPos = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if((arr[i] - lastPos) >= mid) {
                ballCount++;
                if(ballCount == m) return true;
                lastPos = arr[i];
            }
        }
        return false;
    }
}