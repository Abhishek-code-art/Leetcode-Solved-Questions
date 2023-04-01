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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        
        if(root.val > val) {
            root.left = searchBST(root.left, val);
            if(root.left == null) root = null;
            else root = root.left;
        } else {
            root.right = searchBST(root.right, val);
            if(root.right == null) root = null;
            else root = root.right;
        }
        
        return root;
    }
}