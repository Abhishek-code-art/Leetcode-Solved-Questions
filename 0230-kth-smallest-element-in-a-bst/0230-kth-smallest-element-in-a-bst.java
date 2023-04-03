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
    public int kthSmallest(TreeNode root, int k) {
        int ans = -1;
        
        while(root != null) {
            if(root.left != null) {
                TreeNode pred = root.left;
                while(pred.right != null && pred.right != root) {
                    pred = pred.right;
                }
                
                if(pred.right == null) {
                    pred.right = root;
                    root = root.left;
                } else {
                    k--;
                    if(k == 0) {
                        ans = root.val;
                        return ans;
                    }
                    root = root.right;
                }
            } else {
                k--;
                if(k == 0) {
                    ans = root.val;
                    return ans;
                }
                root = root.right;
            }
        }
        return ans;
    }
}