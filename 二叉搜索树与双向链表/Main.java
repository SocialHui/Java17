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
        if (pRootOfTree == null) {
            return null;
        }
        ru(pRootOfTree);
        TreeNode head = queue.poll();
        TreeNode pre = null;
        TreeNode cur = head;
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
    
    public void ru(TreeNode node) {
        if (node == null) {
            return;
        }
        ru(node.left);
        queue.add(node);
        ru(node.right);
    }
}