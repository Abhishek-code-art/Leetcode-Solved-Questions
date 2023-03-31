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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));
        
        while(!q.isEmpty()) {
            Pair temp = q.poll();
            
            TreeNode front = temp.first;
            int hd = temp.second;
            int lvl = temp.third;
            
            if(map.containsKey(hd)) {
                Map<Integer, List<Integer>> levelWise = map.get(hd);
                if(levelWise.containsKey(lvl)) {
                    List<Integer> list = levelWise.get(lvl);
                    
                    int size = list.size();
                    int i;
                    int data = list.get(size-1);
                    for(i = size-1; i>0 && front.val < data;) {
                        i--;
                        data = list.get(i);
                    }
                    if(i == 0 && front.val < data) {
                        list.add(i, front.val);
                    } else {
                        list.add(i+1, front.val);
                    }
                } else {
                    List<Integer> list = new LinkedList<>();
                    list.add(front.val);
                    levelWise.put(lvl, list);
                }
                map.put(hd, levelWise);
            } else {
                Map<Integer, List<Integer>> levelWise = new TreeMap<>();
                List<Integer> newList = new LinkedList<>();
                newList.add(front.val);
                levelWise.put(lvl, newList);
                map.put(hd, levelWise);
            }
            
            if(front.left != null) {
                q.add(new Pair(front.left, hd-1, lvl+1));
            }
            
            if(front.right != null) {
                q.add(new Pair(front.right, hd+1, lvl+1));
            }
        }
        
        for(Map<Integer, List<Integer>> m : map.values()) {
            List<Integer> tempList = new LinkedList<>();
            for(List<Integer> l : m.values()) {
                tempList.addAll(l);
            }
            ans.add(tempList);
        }
        
        return ans;
    }
}

class Pair {
    TreeNode first;
    int second;
    int third;
    
    Pair(){}
    Pair(TreeNode first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}