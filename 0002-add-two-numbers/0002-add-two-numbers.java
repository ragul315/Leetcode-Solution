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
        ListNode head = new ListNode();
        ListNode res=head;
        int rem=0;
        while(l1!=null||l2!=null||rem!=0){
            int n = rem;
            if(l1!=null){
                n+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                n+=l2.val;
                l2=l2.next;
            }
            
            res.next = new ListNode(n%10);
            rem = n/10;
            res=res.next;
        }
        return head.next;
    }
}