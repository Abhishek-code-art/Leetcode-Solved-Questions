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
//         if(l1 == null) return l2;
//         if(l2 == null) return l1;
        
//         if(l1.val <= l2.val) {
//             l1.next = mergeTwoLists(l1.next, l2);
//             return l1;
//         } else {
//             l2.next = mergeTwoLists(l1, l2.next);
//             return l2;
//         }
        
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
        
        if(list1 != null) {
            ans.next = list1;
            ans = list1;
        }
        
        if(list2 != null) {
            ans.next = list2;
            ans = list2;
        }
        
        head = head.next;
        return head;
    }
}