class Solution {
    public boolean isIdealPermutation(int[] nums) {  
        for(int i = 0; i < nums.length; i++) {
            int diff = i-nums[i];
            diff = (diff < 0) ? -diff:diff;
            if(diff > 1) return false;
        }
        return true;
    }
}