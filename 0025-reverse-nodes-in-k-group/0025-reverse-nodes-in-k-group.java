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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = getLength(head);
        return reverse(head, k, len);
    }
    
    public ListNode reverse(ListNode head, int k, int length) {
        if(head == null) return null;
        if(length-k < 0) return head;
        
        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;
        
        int count = 0;
        
        while(count < k && curr != null && (length-k) >= 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(next != null) {
            head.next = reverse(next, k, length-k);    
        }
        
        return prev;
    }
    
    public int getLength(ListNode head) {
        if(head.next == null) return 1;
        int len = 0;
        ListNode curr = head;
        while(curr != null) {
            len++;
            curr = curr.next;
        }
        
        return len;
    }
}