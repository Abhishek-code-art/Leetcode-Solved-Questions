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
    
    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        
        ListNode mid = getMid(head);
        ListNode temp = mid.next;
        mid.next = reverse(temp);
        
        ListNode h1 = head;
        ListNode h2 = mid.next;
        
        while(h2 != null) {
            if(h1.val != h2.val) return false;
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode curr) {
        ListNode prev = null;
        ListNode next = curr;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}