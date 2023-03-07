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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null) return head;
        
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prev = temp;
        
        for(int i = 0; i < left-1; i++) {
            prev = prev.next;
        }
        
        ListNode curr = prev.next;
        for(int i = 0; i < right-left; i++) {
            ListNode pointer = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = pointer;
        }
        
        head = temp.next;
        return temp.next;
    }
}