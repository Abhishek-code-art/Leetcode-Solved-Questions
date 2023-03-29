//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    
    private void mapIndex(int[] in, Map<Integer, Integer> map, int n) {
        for(int i = 0; i < n; i++) {
            map.put(in[i], i);
        }
    }
    
    int index;
    Node buildTree(int in[], int post[], int n) {
        index = n-1;
        Map<Integer, Integer> map = new HashMap<>();
        mapIndex(in, map, n);
        
        Node ans = solve(in, post, map, 0, n-1);
        return ans;
    }
    
    private Node solve(int[] in, int[] post, Map<Integer, Integer> map, int inStart, int inEnd) {
        if(index < 0 || inStart > inEnd) return null;
        
        int element = post[index--];
        Node root = new Node(element);
        int pos = map.get(element);
        
        root.right = solve(in, post, map, pos+1, inEnd);
        root.left = solve(in, post, map, inStart, pos-1);
        
        return root;
    }
}
