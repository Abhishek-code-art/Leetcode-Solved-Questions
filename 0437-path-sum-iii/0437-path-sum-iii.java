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
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        count = 0;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        solve(root, targetSum, 0l, map);
        return count;
    }
    
    private void solve(TreeNode root, int k, long sum, Map<Long, Integer> map) {
        if(root == null) return;
        
        sum += root.val;
        
        if(map.containsKey(sum - k)) {
            count += map.get(sum-k);
        }
        
        if(map.containsKey(sum)) {
            map.put(sum, map.get(sum) + 1);
        } else {
            map.put(sum, 1);
        }
        
        solve(root.left, k, sum, map);
        solve(root.right, k, sum, map);
        
        map.put(sum, map.get(sum) - 1);
        
    }
}  