class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans = 0;
        int gcd = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            gcd = findGCD(nums[i], nums[i]);
            if(gcd == k) ans++;
            
            if(gcd < k) continue;
            for(int j = i+1; j < n; j++) {
                gcd = findGCD(gcd, nums[j]);
                if(gcd == k) ans++;
                
                if(gcd < k) break;
            }
        }
        return ans;
    }
    
    public int findGCD(int a, int b) {
        while(a%b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return b;
    }
}