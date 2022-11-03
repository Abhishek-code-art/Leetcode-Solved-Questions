import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int N = nums.length;
        Arrays.sort(nums);
        return nums[N-k];
    }
}