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
        int[] in = new int[pre.length];
        for(int i = 0; i < in.length; i++) {
            in[i] = pre[i];
        }
        
        Arrays.sort(in);
        Map<Integer, Integer> map = new HashMap<>();
        mapIndex(in, map);
        
        index = 0;
        TreeNode newRoot = solve(in, pre, map, 0, in.length-1, in.length);
        
        return newRoot;
    }
    
    private TreeNode solve(int[] in, int[] pre, Map<Integer, Integer> map, int s, int e, int n) {
        if(index >= n || s > e) return null;
        
        int element = pre[index++];
        TreeNode root = new TreeNode(element);
        int pos = map.get(element);
        
        root.left = solve(in, pre, map, s, pos-1, n);
        root.right = solve(in, pre, map, pos+1, e, n);
        
        return root;
    }
    
    private void mapIndex(int[] in, Map<Integer, Integer> map) {
        for(int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
    }
}