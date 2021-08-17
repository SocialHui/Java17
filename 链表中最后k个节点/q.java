import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param pHead ListNode类 
     * @param k int整型 
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode node = pHead;
        while (k != 0) {
            if (node == null) {
                return null;
            }
            node = node.next;
            k--;
        }
        while (node != null) {
            pHead = pHead.next;
            node = node.next;
        }
        return pHead;
    }
}