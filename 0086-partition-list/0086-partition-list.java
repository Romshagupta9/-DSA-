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
    public ListNode partition(ListNode head, int x) {
       //making two linked list 1 one small elements than x 
       //1 for big elements than x
       //then we'll join the two lists
       ListNode bl=new ListNode();
       ListNode sl=new ListNode();
       ListNode small=sl;
       ListNode big=bl;
       while(head!=null){
        if(head.val<x){
            small.next=head;
            small=small.next;
        }
        else if(head.val>=x){
            big.next=head;
            big=big.next;
        }
        head=head.next;
       }
       small.next=bl.next;
       big.next=null;
       return sl.next;
    }
}