/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node cloneHead = null;
        Node cloneTail = null;
        
        while(temp != null) {
            Node newNode = new Node(temp.val);
            if(cloneHead == null) {
                cloneHead = newNode;
                cloneTail = newNode;
            } else {
                cloneTail.next = newNode;
                cloneTail = newNode;
            }
            temp = temp.next;
        }
        
        Node originalNode = head;
        Node cloneNode = cloneHead;
        
        while(originalNode != null) {
            Node next = originalNode.next;
            originalNode.next = cloneNode;
            originalNode = next;
            next = cloneNode.next;
            cloneNode.next = originalNode;
            cloneNode = next;
        }
        
        originalNode = head;
        cloneNode = cloneHead;
        
        while(originalNode != null) { 
            if(originalNode.random == null) {
                originalNode.next.random = null;
            } else {
                originalNode.next.random = originalNode.random.next;
            }
            if(originalNode.next != null) {
                originalNode = originalNode.next.next;
            } else {
                originalNode = null;
            }
        }
        
        originalNode = head;
        while(cloneNode != null && cloneNode.next != null) {
            originalNode.next = cloneNode.next;
            originalNode = cloneNode.next;
            cloneNode.next = originalNode.next;
            cloneNode = cloneNode.next;
        }
        if(originalNode != null) {
            originalNode.next = null;
        }
        return cloneHead;
    }
}