class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int lcm = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int gcd = gcd(nums[i],nums[i]);
            lcm = (nums[i]*nums[i])/gcd;
            if(lcm == k) ans++;
            
            if(lcm > k) continue;
            for(int j = i+1; j < nums.length; j++) {
                gcd = gcd(lcm, nums[j]);
                lcm = (lcm*nums[j])/gcd;
                if(lcm == k) ans++;
                
                if(lcm > k) break;
            }
        }
        
        return ans;
    }
    public int gcd(int a, int b) {
        while(a%b != 0) {
            int rem = a%b;
            a = b;
            b = rem; 
        }
        return b;
    }
}