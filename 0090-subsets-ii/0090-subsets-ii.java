class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int index = 0;
        Arrays.sort(nums);
        solve(nums, index, res, ans);
        return ans;
    }
    
    public void solve(int[] nums, int index, List<Integer> res, List<List<Integer>> ans) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(res));
            return;
        }
        
        res.add(nums[index]);
        solve(nums, index+1, res, ans);
        res.remove(res.size()-1);
        while(index+1 < nums.length && nums[index] == nums[index+1]) index++;
        solve(nums, index+1, res, ans);
    }
}