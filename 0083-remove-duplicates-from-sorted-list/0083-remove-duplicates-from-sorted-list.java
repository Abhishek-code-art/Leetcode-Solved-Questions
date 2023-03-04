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
        // ListNode next = head.next;
        // while(next != null) {
        //     if(curr.val == next.val) {
        //         while(next != null && curr.val == next.val) {
        //             next = next.next;
        //         }
        //         curr.next = next;
        //     }
        //     curr = next;
        //     if(next != null) {
        //         next = next.next;    
        //     }
        // }
        
        while(curr != null) {
            if(curr.next != null && curr.val == curr.next.val) {
                ListNode nxt_nxt = curr.next.next;
                curr.next = nxt_nxt;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}