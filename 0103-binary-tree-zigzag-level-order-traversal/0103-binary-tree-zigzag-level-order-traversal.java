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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean leftToRight = true;
        
        while(!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                
                // int index = leftToRight ? i:(size-i-1);
                l.add(temp.val);
                
                if(temp.left != null) {
                    q.add(temp.left);
                }
                
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            
            if(!leftToRight) {
                for(int i = 0; i < size; i++) {
                    int index = (size-i-1);
                    l.add(l.remove(index));
                }
            }   
            leftToRight = !leftToRight;
            ans.add(l);
        }
        return ans;
    }
}