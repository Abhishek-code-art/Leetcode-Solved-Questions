class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(candidates);
        
        if(candidates[0] > target) return ans;
        if(candidates[0] == target) {
            output.add(candidates[0]);
            ans.add(output);
            return ans;
        }
        
        solve(candidates, output, 0, target, ans);
        return ans;
    }
    
    public void solve(int[] candidates, List<Integer> output, int index, int target, List<List<Integer>> ans) {
        if(target < 0) return;
        if(target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }
        
        for(int i = index; i<candidates.length; i++) {
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            output.add(candidates[i]);
            solve(candidates, output, i+1, target-candidates[i], ans);
            output.remove(output.size()-1);
        }
    }
}