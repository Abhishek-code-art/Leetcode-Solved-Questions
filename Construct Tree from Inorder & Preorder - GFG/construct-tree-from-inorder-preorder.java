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
        Node ans = solve(inorder, preorder, 0, n-1, n);
        return ans;
    }
    
    private static Node solve(int[] in, int[] pre, int inStart, int inEnd, int n) {
        if(index >= n || inStart > inEnd) {
            return null;
        }
        
        int element = pre[index++];
        Node root = new Node(element);
        int pos = findPosition(in, element, inStart, inEnd);
        // int pos = map.get(element);
        
        root.left = solve(in, pre, inStart, pos-1, n);
        root.right = solve(in, pre, pos+1, inEnd, n);
        
        return root;
    }
    
    private static int findPosition(int[] in, int element, int start, int end) {
        for(int i = start; i <= end; i++) {
            if(in[i] == element) return i;
        }
        return -1;
    }
}
