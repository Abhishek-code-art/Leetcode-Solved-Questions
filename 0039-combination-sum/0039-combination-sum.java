class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        if(target == 1) return ans;
        
        solve(candidates, output, 0, 0, ans, target);
        
        return ans;
    }
    
    public void solve(int[] candidates, List<Integer> output, int sum, int index, List<List<Integer>> ans, int target) {
        if(sum > target) return;
        if(sum == target) {
            ans.add(new ArrayList<>(output));
        }
        
        for(int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            output.add(candidates[i]);
            solve(candidates, output, sum, i, ans, target);
            sum -= candidates[i];
            output.remove(output.size()-1);
        }
    }
    
}