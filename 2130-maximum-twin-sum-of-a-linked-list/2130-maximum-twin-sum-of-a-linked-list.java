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
        Stack<Integer> half = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            half.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        int res = 0;
        while (slow != null) {
            res = Math.max(res, half.pop() + slow.val);
            slow = slow.next;
        }

        return res;
    }
}