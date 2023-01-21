class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        
        return ans;
    }
    
    public void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
        if(index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        
        output.add(nums[index]);
        solve(nums, output, index+1, ans);
        
        output.remove(output.size()-1);
        solve(nums, output, index+1, ans);
    }
}