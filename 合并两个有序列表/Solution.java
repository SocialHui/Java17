/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Solution {
    /**
     *
     * @param l1 ListNode类 
     * @param l2 ListNode类 
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else {
            // write code here
            ListNode node = new ListNode(0);
            ListNode cur = node;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }
            while (l1 != null) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            while (l2 != null){
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
            return node.next;
        }
    }
}