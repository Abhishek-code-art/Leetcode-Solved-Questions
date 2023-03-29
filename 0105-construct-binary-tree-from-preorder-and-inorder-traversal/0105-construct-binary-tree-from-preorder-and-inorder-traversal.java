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
    
    int index;
    private void mapIndex(int[] in, Map<Integer, Integer> map) {
        for(int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        mapIndex(inorder, map);
        TreeNode ans = solve(preorder, inorder, map, 0, inorder.length, inorder.length);
        return ans;
    }
    
    private TreeNode solve(int[] pre, int[] in, Map<Integer, Integer> map, int inStart, int inEnd, int n) {
        
        if(index >= n || inStart > inEnd) return null;
        
        int element = pre[index++];
        TreeNode root = new TreeNode(element);
        int pos = map.get(element);
        
        root.left = solve(pre, in, map, inStart, pos-1, n);
        root.right = solve(pre, in, map, pos+1, inEnd, n);
        
        return root;
    }
}