/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode curr = head;
        ListNode next = head.next;
        ListNode prev = null;
        
        while(next != null) {
            if(curr.val == next.val) {
                while(next != null && curr.val == next.val) {
                    next = next.next;
                }
                if(prev == null) {
                    head = next;
                } else {
                    prev.next = next;  
                }
                curr = next;
                if(next!=null) {
                    next = next.next;    
                }
            } else {
                prev = curr;
                curr = next;
                next = next.next;
            }
            
        }
        return head;
    }
}