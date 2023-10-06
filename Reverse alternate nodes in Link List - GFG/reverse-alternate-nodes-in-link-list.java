//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node head)
    {
        if(head.next == null) return;
        Node odd = new Node(-1);
        Node even = new Node(-1);
        Node oddHead = odd;
        Node evenHead = even;
        
        Node temp = head;
        boolean isEven = false;
        while(temp != null) {
            if(isEven) {
                even.next = temp;
                even = even.next;
            } else {
                odd.next = temp;
                odd = odd.next;
            }
            isEven = !isEven;
            temp = temp.next;
        }
        
        even.next = null;
        
        Node rev = reverse(evenHead.next);
        evenHead = evenHead.next;
        odd.next = rev;
        
        head = oddHead.next;
        
    }
    
    private static Node reverse(Node node) {
        Node curr = node;
        Node prev = null;
        Node next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
