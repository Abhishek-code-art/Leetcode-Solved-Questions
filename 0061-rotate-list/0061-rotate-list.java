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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0) return head;
        if(head == null || head.next == null) return head;
        
        ListNode curr = head;
        int len = 0;
        while(curr != null) {
            len++;
            curr = curr.next;
        }
        
        k = k%len;
        head = reverse(head, 0, len-1);
        head = reverse(head, 0, k-1);
        head = reverse(head, k, len);
        
        return head;
        
    }
    
    public ListNode reverse(ListNode head, int l, int r) {
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        temp.next = head;
        for(int i = 0; i < l; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        
        for(int i = 0; i < r-l; i++) {
            if(curr.next != null) {
            ListNode ptr = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = ptr;
            }
        }
        return temp.next;
    }
}