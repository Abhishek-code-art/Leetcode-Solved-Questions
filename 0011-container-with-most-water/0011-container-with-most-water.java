class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int ans = 0;
        
        while(i<j) {
            int h = Math.min(height[i], height[j]);
            ans = Math.max(ans, (j-i)*h);
            while(i<j && height[i] <= h) i++;
            while(i<j && height[j] <= h) j--;
        }
        return ans;
    }
}