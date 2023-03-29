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
    
    private void mapIndex(int[] in, Map<Integer, Integer> map, int n) {
        for(int i = 0; i < n; i++) {
            map.put(in[i], i);
        }
    }
    
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        index = n-1;
        
        Map<Integer, Integer> map = new HashMap<>();
        mapIndex(inorder, map, n);
        
        TreeNode ans = solve(inorder, postorder, map, 0, n-1, n);
        return ans;
    }
    
    private TreeNode solve(int[] in, int[] post, Map<Integer, Integer> map, int inStart, int inEnd, int n) {
        
        if(index < 0 || inStart > inEnd) return null;
        
        int element = post[index--];
        TreeNode root = new TreeNode(element);
        int pos = map.get(element);
        
        root.right = solve(in, post, map, pos+1, inEnd, n);
        root.left = solve(in, post, map, inStart, pos-1, n);
        
        return root;
    }
}