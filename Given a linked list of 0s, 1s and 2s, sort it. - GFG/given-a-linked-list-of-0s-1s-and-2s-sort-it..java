//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head.next == null) return head;
        
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        
        Node curr = head;
        while(curr != null) {
            int val = curr.data;
            if(val == 0) {
                zeroTail = insertToTail(zeroTail, curr);
            } else if(val == 1) {
                oneTail = insertToTail(oneTail, curr);
            } else if(val == 2) {
                twoTail = insertToTail(twoTail, curr);
            }
            curr = curr.next;
        }

        if(oneHead.next != null) {
            zeroTail.next = oneHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }
        
        oneTail.next = twoHead.next;
        twoTail.next = null;
        head = zeroHead.next;
        zeroHead = null;
        oneHead = null;
        twoHead = null;
        
        return head;
    }
    
    public static Node insertToTail(Node tail, Node curr) {
        tail.next = curr;
        tail = curr;
        return tail;
    }
}