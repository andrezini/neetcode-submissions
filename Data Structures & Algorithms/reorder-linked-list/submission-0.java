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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode reverseList = reverse(secondHalf);
        ListNode curr = head;

        while (reverseList != null) {
            ListNode next1 = curr.next;
            ListNode next2 = reverseList.next;

            curr.next = reverseList;
            reverseList.next = next1;

            curr = next1;
            reverseList = next2;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
