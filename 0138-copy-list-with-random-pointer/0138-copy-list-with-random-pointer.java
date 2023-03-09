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
        Map<Node, Node> map = new HashMap<>();
        
        while(originalNode != null) {
            map.put(originalNode, cloneNode);
            originalNode = originalNode.next;
            cloneNode = cloneNode.next;
        }
        
        originalNode = head;
        cloneNode = cloneHead;
        
        while(originalNode != null) {
            cloneNode.random = map.get(originalNode.random);
            originalNode = originalNode.next;
            cloneNode = cloneNode.next;
        }
        
        return cloneHead;
    }
}