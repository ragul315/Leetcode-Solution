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
    public int pairSum(ListNode head) {
        ListNode f1 = head, f2 = head;
        
        while (f1 != null && f1.next != null) {
            f1 = f1.next.next;
            f2 = f2.next;
        }
        
        f2 = reverse(f2); 
        f1 = head; 
        
        int max = Integer.MIN_VALUE;
        while (f2 != null) {
            max = Math.max(max, f1.val + f2.val);
            f1 = f1.next;
            f2 = f2.next;
        }
        
        return max;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
