/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        int num1 = 0;
        int num2 = 0;
        while (cur1 != null) {
            num1++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            num2++;
            cur2 = cur2.next;
        }
        int num = Math.abs(num1-num2);
        cur1 = pHead1;
        cur2 = pHead2;
        if (num1 > num2) {
            while (num != 0) {
                cur1 = cur1.next;
                num--;
            }
        }
        if (num2 > num1) {
            while (num != 0) {
                cur2 = cur2.next;
                num--;
            }
        }
        while (cur1 != null && cur2 != null) {
            if (cur1 == cur2) {
                return cur1;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return null;
    }
}