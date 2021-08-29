/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/

import java.util.*;

public class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        //中序遍历的结果转换为双向链表
        //首先中序遍历将所有的结果全部保存在队列里面
        //然后将队列里面的结果变成双向链表
        if (pRootOfTree == null) {
            return null;
        }
        ru(pRootOfTree);
        
        TreeNode head = queue.poll();
        TreeNode cur = head;
        TreeNode pre = null;
        TreeNode next = null;
        while (!queue.isEmpty()) {
            next = queue.poll();
            cur.left = pre;
            cur.right = next;
            pre = cur;
            cur = next;
        }
        cur.left = pre;
        cur.right = null;
        return head;
    }
    
    public void ru(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        ru(pRootOfTree.left);
        queue.offer(pRootOfTree);
        ru(pRootOfTree.right);
    }
}