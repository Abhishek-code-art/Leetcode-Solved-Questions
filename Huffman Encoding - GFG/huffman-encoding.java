//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            int N = S.length();
            Solution ob = new Solution();
            String[] element = br.readLine().trim().split("\\s+");
		    int[] f = new int[N];
		    for(int i = 0; i < N; i++){
		        f[i] = Integer.parseInt(element[i]);
		    }
            ArrayList<String> res  = ob.huffmanCodes(S,f,N);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        PriorityQueue<TreeNode> pq = new PriorityQueue<>(new Comparator<TreeNode>() {
             public int compare(TreeNode node1, TreeNode node2) {
                 if(node1.data >= node2.data) {
                     return 1;
                 } else {
                     return -1;
                 }
             }
        });
        
        for(int i = 0; i < N; i++) {
            TreeNode node = new TreeNode(f[i]);
            pq.add(node);
        }
        
        while(pq.size() > 1) {
            TreeNode left = pq.poll();
            TreeNode right = pq.poll();
            
            TreeNode newNode = new TreeNode(left.data + right.data);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }
        
        TreeNode root = pq.poll();
        ArrayList<String> ans = new ArrayList<>();
        String temp = "";
        traverse(root, ans, temp);
        
        return ans;
    }
    
    private void traverse(TreeNode root, ArrayList<String> ans, String temp) {
        if(root.left == null && root.right == null) {
            ans.add(temp);
            return;
        }
        
        traverse(root.left, ans, temp+"0");
        
        traverse(root.right, ans, temp + "1");
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
    
} 