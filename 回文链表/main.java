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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode head1 = null;
        ListNode head2 = null;
        if (quick == null) {
            //代表有偶数个数字
            head1 = pre;
            head2 = cur;
        } else {
            head1 = pre;
            head2 = cur.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}