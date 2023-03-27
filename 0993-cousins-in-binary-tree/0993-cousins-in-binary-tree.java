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
    public boolean isCousins(TreeNode root, int x, int y) {
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         boolean isX = false;
//         boolean isY = false;
        
//         while(!q.isEmpty()) {
//             int n = q.size();
//             for(int i = 0; i < n; i++) {
//                 TreeNode curr = q.poll();
//                 if(curr.val == x) isX = true;
//                 if(curr.val == y) isY = true;
                
//                 if(curr.left != null && curr.right != null) {
//                     if(curr.left.val == x && curr.right.val == y) return false;
//                     if(curr.left.val == y && curr.right.val == x) return false;
//                 }
                
//                 if(curr.left != null) {
//                     q.add(curr.left);
//                 }
                
//                 if(curr.right != null) {
//                     q.add(curr.right);
//                 }
//             }
//             if(isX && isY) return true;
//         }
//         return false;
        
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return false;
        queue.add(root);
        int depthY = -1;
        int depthX = -2;
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.remove();
                if(node.left != null && node.right != null){
                    if(node.left.val == x && node.right.val == y) return false;
                    if(node.left.val == y && node.right.val == x) return false;
                }
                if(node.val == x) depthX = level;
                if(node.val == y) depthY = level;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(depthX == level && depthY == level) return true;
            level++;
        }
        return false;
    }
}