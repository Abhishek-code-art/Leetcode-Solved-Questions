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
    public ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head;
        }   
        
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null) {
            slow = slow.next;
            if(fast.next != null) {
                fast = fast.next.next;    
            } else {
                fast = fast.next;
            }
            
        }
        
        return slow;
    }
    
    // public int getLength(ListNode head) {
    //     int length = 0;
    //     while(head != null) {
    //         length++;
    //         head = head.next;
    //     }
    //     return length;
    // }
}