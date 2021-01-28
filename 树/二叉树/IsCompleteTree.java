import java.util.LinkedList;
import java.util.Queue;

public class IsCompleteTree {
    //二叉树的完全性检验
    public boolean isCompleteTree(BTNode root) {
        if (root == null) return true;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        BTNode cur = queue.poll();
        while (cur != null) {
            queue.offer(cur.left);
            queue.offer(cur.right);
            cur = queue.poll();
        }
        while (!queue.isEmpty()) {
            if (queue.poll() != null) return false;
        }
        return true;
    }
}
