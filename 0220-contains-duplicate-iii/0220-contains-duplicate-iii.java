class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int i = 0;
        int j = 1;
        
        while(i < nums.length) {
            if(j<nums.length && Math.abs(i-j) <= indexDiff && Math.abs(nums[i]-nums[j]) <= valueDiff) {
                return true;
            }
            
            if(Math.abs(i-j) > indexDiff) {
                i++;
                j = i+1;
            } else {
                j++;
            }
            
        }
        return false;
    }
}