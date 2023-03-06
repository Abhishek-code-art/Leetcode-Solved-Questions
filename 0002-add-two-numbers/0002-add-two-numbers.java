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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode ans = head;
        int carry = 0;
        
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            ListNode next;
            if(sum >= 10) {
                next = new ListNode(sum%10);  
                carry = sum/10;
            } else {
                next = new ListNode(sum);
                carry = 0;
            }
            
            ans.next = next;
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null) {
            int sum = l1.val + carry;
            ListNode next;
            if(sum >= 10) {
                next = new ListNode(sum%10);
                carry = sum/10;
            } else {
                next = new ListNode(sum);
                carry = 0;
            }
            
            if(ans != null) {
                ans.next = next;
                ans = ans.next; 
            }
            
            l1 = l1.next;
        }
        
        while(l2 != null) {
            int sum = l2.val + carry;
            ListNode next;
            if(sum >= 10) {
                next = new ListNode(sum%10);
                carry = sum/10;
            } else {
                next = new ListNode(sum);
                carry = 0;
            }
            
            if(ans != null) {
                ans.next = next;
                ans = ans.next;    
            }
            
            l2 = l2.next;
        }
        
        if(carry != 0) {
            ListNode next = new ListNode(carry);
            if(ans != null) {
            ans.next = next;
            ans = ans.next;    
            }
            
        }
        head = head.next;
        return head;
    }
}