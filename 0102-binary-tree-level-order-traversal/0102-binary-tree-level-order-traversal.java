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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()) {
            TreeNode temp = q.peek();
            q.poll();
            if(temp == null) {
                ans.add(l);
                l = new ArrayList<>();
                if(!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                l.add(temp.val);
                
                if(temp.left != null) {
                    q.add(temp.left);
                }
                
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return ans;
    }
}