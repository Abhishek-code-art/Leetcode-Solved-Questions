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
    public ListNode mergeKLists(ListNode[] lists) {
        return solve(lists, 0, lists.length-1);
    }
    
    public ListNode solve(ListNode[] list, int lo, int hi ) {
        if(lo == hi) return list[lo];
        if(lo < hi) {
            int mid = (lo+hi)/2;
            ListNode l1 = solve(list, lo, mid);
            ListNode l2 = solve(list, mid+1, hi);
            return merge(l1,l2);
        } else return null;
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}