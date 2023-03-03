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
        
        int length = getLength(head);
        int ans = length/2;
        ListNode temp = head;
        while(ans > 0) {
            temp = temp.next;
            ans--;
        }
        
        return temp;
    }
    
    public int getLength(ListNode head) {
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}