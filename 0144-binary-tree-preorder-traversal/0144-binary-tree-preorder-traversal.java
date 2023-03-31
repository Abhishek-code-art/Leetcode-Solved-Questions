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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        
        while(root != null) {
            if(root.left != null) {
                TreeNode pred = root.left;
                while(pred.right != null && pred.right != root) {
                    pred = pred.right;
                }
                
                if(pred.right == null) {
                    pred.right = root;
                    ans.add(root.val);
                    root = root.left;
                } else {
                    pred.right = null;
                    root = root.right;
                }
            } else {
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }
}