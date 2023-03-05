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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return list1;
        
        if(list1 == null && list2 != null) {
            return list2;
        }
        if(list1 != null && list2 == null) {
            return list1;
        }
        
        ListNode ans = new ListNode(-101);
        ListNode head = ans;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                ans.next = list1;
                ans = list1;
                list1 = list1.next;
            } else {
                ans.next = list2;
                ans = list2;
                list2 = list2.next;
            }
        }
        
        while(list1 != null) {
            ans.next = list1;
            ans = list1;
            list1 = list1.next;
        }
        
        while(list2 != null) {
            ans.next = list2;
            ans = list2;
            list2 = list2.next;
        }
        
        head = head.next;
        return head;
    }
}