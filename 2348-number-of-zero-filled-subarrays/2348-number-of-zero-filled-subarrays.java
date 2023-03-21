class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long res = 0;
        
        for(int i : nums) {
            if(i == 0) {
                count++;
            } else {
                res += (count*(count+1))/2;
                count = 0;
            }
        }
        
        if(count != 0) {
            res += (count*(count+1))/2;
            count = 0;
        } 
        
        return res;
    }
}