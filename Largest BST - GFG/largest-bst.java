//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class NodeVal {
    boolean isBST;
    int minNode, maxNode, maxSize;
    
    NodeVal() {
        isBST = true;
        minNode = Integer.MAX_VALUE;
        maxNode = Integer.MIN_VALUE;
        maxSize = 0;
    }
}
class Solution{
    
    static int ans;
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        ans = 0;
        solve(root);
        return ans;
    }
    
    private static NodeVal solve(Node root) {
        if(root == null) {
            return new NodeVal();
        }
        
        NodeVal curr = new NodeVal();
        
        NodeVal left = solve(root.left);
        NodeVal right = solve(root.right);
        
        if((left.isBST && right.isBST) && (left.maxNode < root.data && root.data < right.minNode)) {
            curr.isBST = true;
            curr.minNode = Math.min(left.minNode, root.data);
            curr.maxNode = Math.max(right.maxNode, root.data);
            curr.maxSize = left.maxSize + right.maxSize + 1;
        } else {
            curr.isBST = false;
            curr.maxSize = Math.max(left.maxSize, right.maxSize);
        }
        
        ans = Math.max(ans, curr.maxSize);
        return curr;
    }
}