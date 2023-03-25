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
    int ans = -1000;
    public int maxPathSum(TreeNode root) {
        maxDepth(root);
        return ans;
    }
    
    int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = Math.max(maxDepth(root.left), 0);
        int right = Math.max(maxDepth(root.right), 0);
        int lToR = left + right + root.val;
        
        ans = Math.max(ans, lToR);
        
        return root.val + Math.max(left, right);
    }
}