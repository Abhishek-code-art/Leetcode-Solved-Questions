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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, root, 0);
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, TreeNode root, int level) {
        if(root == null) {
            return;
        } else {
            if(level >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            
            ans.get(level).add(root.val);
            helper(ans, root.left, level+1);
            helper(ans, root.right, level+1);
        }
    }
}