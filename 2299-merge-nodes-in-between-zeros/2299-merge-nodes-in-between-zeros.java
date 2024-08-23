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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next,str=head;
        int cnt=0;
        while(temp!=null){
            if(temp.val==0){
                str.next=new ListNode(cnt);
                str=str.next;
                cnt=0;
               
            }
            else{
                cnt+=temp.val;
            }
         
            temp=temp.next;
        }
        return head.next;
        
    }
}