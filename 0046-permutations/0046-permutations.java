class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        int index = 0;
        solve(nums, new ArrayList<>(), ans);
        return ans;
    }
    
    public void solve(int[] nums, ArrayList<Integer> output, List<List<Integer>> ans) {
        if(output.size() >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        
        for(int j = 0; j < nums.length; j++) {
            if(output.contains(nums[j])) continue;
            
            output.add(nums[j]);
            solve(nums, output, ans);
            output.remove(output.size()-1);
        }
    }
}