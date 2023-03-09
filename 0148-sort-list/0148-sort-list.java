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
   
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode mid = getMid(head);
        
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        
        left = sortList(left);
        right = sortList(right);
        
        ListNode ans = merge(left, right);
        return ans;
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                ans.next = l1;
                ans = l1;
                l1 = l1.next;
            } else {
                ans.next = l2;
                ans = l2;
                l2 = l2.next;
            }
        }
        
        if(l1 != null) {
            ans.next = l1;
            ans = l1;
        }
        
        if(l2 != null) {
            ans.next = l2;
            ans = l2;
        }
        
        return head.next;
    }
}