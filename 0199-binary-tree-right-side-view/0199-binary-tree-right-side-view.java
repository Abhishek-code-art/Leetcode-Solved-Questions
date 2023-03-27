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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i = 0; i < n; i++) {
                TreeNode front = q.poll();
                
                if(i == n-1) {
                    ans.add(front.val);
                }
                
                if(front.left != null) {
                    q.add(front.left);
                }
                
                if(front.right != null) {
                    q.add(front.right);
                }
            }
        }
        return ans;
    }
}