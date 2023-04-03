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
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        ans = -1;
        solve(root, k);
        return ans;
    }
  
    private int solve(TreeNode root, int k) {
        if(root == null) return k;
        
        k = solve(root.left, k);
        k--;
        if(k == 0) {
            ans = root.val;
        }
        
        k = solve(root.right, k);
        
        return k;
    }
}