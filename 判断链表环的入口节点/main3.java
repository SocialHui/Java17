/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode q = pHead;
        ListNode s = pHead;
        while (q != null && q.next != null) {
            s = s.next;
            q = q.next.next;
            if (s == q) {
                break;
            }
        }
        if (q == null || q.next == null) {
            return null;
        }
        s = pHead;
        while (s != q) {
            s = s.next;
            q = q.next;
        }
        return s;
    }
}