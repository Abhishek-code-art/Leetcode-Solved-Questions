class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int temp = 1;
        
        for(int i = 0; i < nums.length; i++) {
            answer[i] = temp;
            temp *= nums[i];
        }
        
        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        
        return answer;
    }
}