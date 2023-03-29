//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    static int index;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        index = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        mapIndex(inorder, map, n);
        Node ans = solve(inorder, preorder, map, 0, n-1, n);
        return ans;
    }
    
    private static Node solve(int[] in, int[] pre, Map<Integer, List<Integer>> map, int inStart, int inEnd, int n) {
        if(index >= n || inStart > inEnd) {
            return null;
        }
        
        int element = pre[index++];
        Node root = new Node(element);
        List<Integer> l = map.get(element);
        int pos = l.remove(0);
        
        root.left = solve(in, pre, map, inStart, pos-1, n);
        root.right = solve(in, pre, map, pos+1, inEnd, n);
        
        return root;
    }
    
    private static void mapIndex(int[] in, Map<Integer, List<Integer>> map, int n) {
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(in[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(in[i], list);
            } else {
                List<Integer> list = map.get(in[i]);
                list.add(i);
                map.put(in[i], list);
            }
        }
    }
}
