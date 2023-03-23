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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // when we encounter with null that means level is completed. 
        q.add(null);
        
        while(!q.isEmpty()) {
            TreeNode temp = q.peek();
            q.poll();
            
            if(temp == null) {// when a level is finished adding the list into ans.
                ans.add(0, l);
                // new list for new level
                l = new ArrayList<>();
                
                if(!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                //adding the data of current level node into the list.
                l.add(temp.val);
                
// adding the next level or child of current node into the queue so that when one level is // finished we can go to next level by checking the front of queue.
                
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