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
    
    private TreeNode solve(int s, int e, ArrayList<TreeNode> ans) {
        if(s > e) return null;
        
        int mid = (s+e)/2;
        TreeNode newRoot = ans.get(mid);
        newRoot.left = solve(s, mid-1, ans);
        newRoot.right = solve(mid+1, e, ans);
        
        return newRoot;
    }
    
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        inorder(root, ans);
        
        return solve(0, ans.size()-1, ans);
    }
    
    private void inorder(TreeNode root, ArrayList<TreeNode> ans) {
        if(root == null) return;
        
        inorder(root.left, ans);
        ans.add(root);
        inorder(root.right, ans);
    }
}