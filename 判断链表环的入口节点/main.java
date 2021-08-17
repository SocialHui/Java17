/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
/**
*首先判断有没有环：
*  1.快指针每次走两步，慢指针每次走一步，如果她两相遇，就是有环
*  2. 从相遇的节点开始判断环有几个节点
*  3. 快指针从头节点开始走环的节点个数，然后快慢指针各一步走，相遇的节点就是环的入口节点
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        ListNode s = pHead;
        ListNode q = pHead.next;
        if (q == null) {
            return null;
        }
        while (s != null && q != null) {
            if (s == q) {
                break;
            } 
            if (q.next == null) {
                s = null;
                break;
            }
            s = s.next;
            q = q.next.next;
        }
        if (s == null) {
            return null;
        }
        
        ListNode node = s;
        int num = 0;
        while (true) {
            num++;
            if (node.next == s) {
                break;
            }
            node = node.next;
        }
        
        q = pHead;
        s = pHead;
        while (num != 0) {
            q = q.next;
            num--;
        }
        while (q != s) {
            q = q.next;
            s = s.next;
        }
        return q;
    }
}