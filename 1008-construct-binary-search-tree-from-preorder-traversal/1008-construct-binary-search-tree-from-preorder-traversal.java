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
    private int index;
    public TreeNode bstFromPreorder(int[] pre) {
        index = 0;
        return solve(pre, Integer.MIN_VALUE, Integer.MAX_VALUE, pre.length);
    }
    
    private TreeNode solve(int[] pre, int min, int max, int n) {
        if(index >= n) return null;
        
        int element = pre[index];
        if(element > min && element < max) {
            index++;
            TreeNode root = new TreeNode(element);
            root.left = solve(pre, min, element, n);
            root.right = solve(pre, element, max, n);
            
            return root;
        } else {
            return null;
        }
    }
}