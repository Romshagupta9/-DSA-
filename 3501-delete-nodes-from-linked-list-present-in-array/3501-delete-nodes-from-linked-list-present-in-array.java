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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (head != null) {
            while (head != null && set.contains(head.val)) {
                head = head.next;
            }
            curr.next = head;
            curr = curr.next;
            if (head != null) head = head.next;
        }
        return dummy.next;
    }
}