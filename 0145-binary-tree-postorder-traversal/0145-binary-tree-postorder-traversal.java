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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode curr = root;
        
        while(curr != null || !st.isEmpty()) {
           if(curr != null) {
               st.push(curr);
               ans.add(0, curr.val);
               curr = curr.right;
           } else {
               TreeNode temp = st.pop();
               curr = temp.left;
           }
        }
        return ans;
    }
}