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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        head = reverse(head, curr, prev);
        
        return head;
    }
    
    public ListNode reverse(ListNode head, ListNode curr, ListNode prev) {
        if(curr == null) {
            head = prev;
            return head;
        }
        
        ListNode forward = curr.next;
        head = reverse(head, forward, curr);
        curr.next = prev;
        return head;
    }
}