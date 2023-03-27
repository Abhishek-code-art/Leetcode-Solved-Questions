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
    int level;
    int ans;
    
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        this.level = 0;
        this.ans = 0;
        solve(root, 0);
        return ans;
    }
    
    private void solve(TreeNode root, int level) {
        if(root == null) {
            return;
        }
        
        if(level > this.level) {
            this.level = level;
            ans = root.val;
        }
        
        if(root.left != null) solve(root.left, level+1);
        if(root.right != null) solve(root.right, level+1);
    }
}