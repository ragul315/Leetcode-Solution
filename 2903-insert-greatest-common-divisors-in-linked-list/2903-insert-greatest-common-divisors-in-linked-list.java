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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while (temp.next!=null){
            ListNode nn = new ListNode(gcd(temp.val,temp.next.val));
            nn.next=temp.next;
            temp.next=nn;
            temp=nn.next;
        }
        return head;
    }
    public int gcd(int n,int m){
        if(m!=0){
            return gcd(m,n%m);
        }
        else{
            return n;
        }
    }
}