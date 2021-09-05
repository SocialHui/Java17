/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        //反转后半部分的链表，然后遍历前半部分和后半部分的链表，进行插入操作
        //一个一步一步走，一个两步两步走，等到快指针的节点为null的时候，满指针就只想中间节点
        //指向中间节点之后就开始反转链表
        //反转链表之后开始遍历插入
        if (head == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode node = head;
        while (fast != null && fast.next != null) {
            node = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = null;
        ListNode pre = null;
        ListNode next = null;
        if (fast == null) {
            //代表是偶数个，这个时候将node
            node.next = null;
            cur = slow;
        } else if (fast.next == null) {
            cur = slow.next;
            slow.next = null;
        }
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        ListNode newHead = pre;
        ListNode newNode = null;
        while (newHead != null) {
            newNode = newHead.next;
            node = head.next;
            newHead.next = node;
            head.next = newHead;
            head = node;
            newHead = newNode;
        }
    }
}