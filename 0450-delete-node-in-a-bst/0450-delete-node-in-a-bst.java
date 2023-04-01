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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(root.val == key) {
            if(root.left == null && root.right == null) {
                root = null;
                return root;
            }
            
            if(root.left != null && root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            
            if(root.left == null && root.right != null) {
                TreeNode temp = root.right;
                root = null;
                return temp;
            }
            
            if(root.left != null && root.right != null) {
                int min = minValue(root.right).val;
                root.val = min;
                root.right = deleteNode(root.right, min);
                return root;
            }
        } else if(root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            root.right = deleteNode(root.right, key);
            return root;
        }
        return null;
    }
    
    private TreeNode minValue(TreeNode curr) {
        if(curr == null) return curr;
        while(curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}