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
    public int diameterOfBinaryTree(TreeNode root) {
        return fastDiameter(root).diameter;
    }
    
    private Pair fastDiameter(TreeNode root) {
        if(root == null) {
            Pair p = new Pair(0, 0);
            return p;
        }
        
        Pair left = fastDiameter(root.left);
        Pair right = fastDiameter(root.right);
        
        int lDiameter = left.diameter;
        int rDiameter = right.diameter;
        int lToR = left.height + right.height;
        
        Pair ans = new Pair();
        ans.diameter = Math.max(lDiameter, Math.max(rDiameter, lToR));
        ans.height = Math.max(left.height, right.height) + 1;
        
        return ans;
    }
}

class Pair {
    int diameter;
    int height;
    
    Pair() {}
    Pair(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}