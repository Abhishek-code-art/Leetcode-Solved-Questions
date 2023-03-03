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
        
        // ListNode curr = head;
        // ListNode prev = null;
        
        head = reverse(head);
        
        return head;
    }
    
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = reverse(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }
}