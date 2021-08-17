/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

import java.util.*;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        //HashSet解决
        if (pHead == null) {
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            } else {
                set.add(pHead);
            }
            pHead = pHead.next;
        }
        return null;
    }
}