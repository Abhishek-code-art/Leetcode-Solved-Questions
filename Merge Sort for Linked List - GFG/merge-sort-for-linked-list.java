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
		   
		      head = new Solution().mergeSort(head);
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
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node mid = getMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    private static Node merge(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        Node ans = new Node(-1);
        Node temp = ans;
        
        while(l1 != null && l2 != null) {
            if(l1.data <= l2.data) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        
        if(l1 != null) {
            temp.next = l1;
        }
        if(l2 != null) {
            temp.next = l2;
        }
        return ans.next;
    }
}


