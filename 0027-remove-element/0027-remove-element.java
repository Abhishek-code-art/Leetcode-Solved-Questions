class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        
        while(j < n) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            } else {
                count++;
            }
            
            j++;
        }
        
        return (n-count);
    }
}