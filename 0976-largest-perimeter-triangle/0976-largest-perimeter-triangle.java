class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxPerimeter = 0;
        int k = 3;
        while(j < nums.length) {
            sum += nums[j];
            if((j-i+1) < k) j++;
            else if((j-i+1) == k) {
                if(nums[i] + nums[i+1] > nums[j]) {
                    maxPerimeter = Math.max(sum, maxPerimeter);
                }
                sum -= nums[i];
                i++;
                j++;
            }
        }
        
        return maxPerimeter;
    }
}