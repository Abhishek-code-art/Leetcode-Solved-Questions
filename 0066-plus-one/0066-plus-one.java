class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] = digits[n-1]+1;
        
        if(digits[n-1] == 10) {
            for(int i = n-1; i >= 0; i--) {
                if(digits[i] == 10) {
                    if(i == 0) {
                        int[] ans = new int[n+1];
                        ans[0] = 1;
                        ans[1] = 0;
                        for(int j = 2; j < ans.length; j++) {
                            ans[j] = digits[j-1];
                        }
                        return ans;
                    } else {
                        digits[i] = 0;
                        digits[i-1] = digits[i-1] + 1;
                    }
                } else break;
            }
        }
        return digits;
    }
}