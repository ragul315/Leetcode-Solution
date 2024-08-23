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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        int c=0;
        while(c<a-1){
            temp=temp.next;
            c++;
        }
        ListNode n=temp;
      
        while(c<b+1){
            n=n.next;
            c++;
        }
        temp.next=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return list1;
    }
}