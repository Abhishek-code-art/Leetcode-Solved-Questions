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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        int size = 0;
        ListNode temp = head;
        
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        int position = size-n;
        while(position > 0) {
            prev = curr;
            curr = curr.next;
            position--;
        }
        if(prev == null) {
            prev = curr.next;
            return prev;
        } else {
            prev.next = curr.next;
            curr.next = null;
        }
        return head;
    }
}