class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int[] res = new int[nums.length - k + 1];
        java.util.TreeMap<Integer, Integer> t = new java.util.TreeMap<>();
        
        while(j < nums.length) {
            t.put(nums[j], t.getOrDefault(nums[j], 0) + 1);
            if((j-i+1) < k) j++;
            else 
                if(j-i+1 == k) {
                    res[i] = t.lastKey();
                    t.put(nums[i], t.getOrDefault(nums[i], 0) - 1);
                
                    if(t.get(nums[i]) == 0) {
                        t.remove(nums[i]);
                    }
                    i++;
                    j++;
                }
            }
        return res;
    }
}