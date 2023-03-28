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
    int pow = Integer.MAX_VALUE;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        count = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L,1);
        solve(root, targetSum, 0, map);
        return count;
    }
    
    private void solve(TreeNode root, int k, long sum, HashMap<Long, Integer> map) {
        if(root == null) return;
        
        sum = sum+root.val;
        
        if(map.containsKey(sum - k)) {
            count += map.get(sum-k);
        }
        
        if(!map.containsKey(sum)) {
            map.put(sum, 1);
        } else {
            map.put(sum, map.get(sum) + 1);
        }
        
        solve(root.left, k, sum, map);
        solve(root.right, k, sum, map);
        
        map.put(sum, map.get(sum) - 1);
    }
}