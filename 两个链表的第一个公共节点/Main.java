/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

import java.util.*;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (pHead1 != null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode node = null;
        boolean flag = false;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            ListNode node1 = stack1.pop();
            ListNode node2 = stack2.pop();
            if (node1 == node2) {
                node = node1;
                flag = true;
            } else {
                break;
            }
        }
        if (flag) {
            return node;
        } else {
            return null;
        }
    }
}