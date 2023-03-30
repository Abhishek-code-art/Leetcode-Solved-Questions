//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    private static int burnTree(Node root, Map<Node, Node> nodeToParent) {
        Map<Node, Boolean> visited = new HashMap<>();
        visited.put(root, true);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int ans = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            boolean flag = false;
            for(int i = 0; i < size; i++) {
                Node curr = q.poll();
                
                if(curr.left != null && visited.getOrDefault(curr.left, false) == false) {
                    visited.put(curr.left, true);
                    q.add(curr.left);
                    flag = true;
                }
                
                if(curr.right != null && visited.getOrDefault(curr.right, false) == false) {
                    visited.put(curr.right, true);
                    q.add(curr.right);
                    flag = true;
                }
                
                if(nodeToParent.get(curr) != null && visited.getOrDefault(nodeToParent.get(curr), false) == false) {
                    visited.put(nodeToParent.get(curr), true);
                    q.add(nodeToParent.get(curr));
                    flag = true;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
    
    public static int minTime(Node root, int target) 
    {
        Map<Node, Node> nodeToParent = new HashMap<>();
        nodeToParent.put(root, null);
        Node targetNode = createMapping(root, target, nodeToParent);
        
        int ans = burnTree(targetNode, nodeToParent);
        return ans;
    }
    
    private static Node createMapping(Node root, int target, Map<Node, Node> map) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node res = null;
        while(!q.isEmpty()) {
            Node curr = q.poll();
            
            if(curr.data == target) {
                res = curr;
            }
            
            if(curr.left != null) {
                map.put(curr.left, curr);
                q.add(curr.left);
            }
            
            if(curr.right != null) {
                map.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        return res;
    }
}