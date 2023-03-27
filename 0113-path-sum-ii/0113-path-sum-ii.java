/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        solve(root, targetSum, 0, ans, l);
        return ans;
    }

    private void solve(TreeNode root, int k, int sum, List<List<Integer>> ans, List<Integer> l) {
        if(root == null) return;
        
        sum += root.val;
        l.add(root.val);
        
        if(root.left == null && root.right == null && sum == k) {
            ans.add(new ArrayList<>(l));
            return;
        } 
        
        solve(root.left, k, sum, ans, new ArrayList<>(l));
        solve(root.right, k, sum, ans, new ArrayList<>(l));    
    }
}